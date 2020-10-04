import java.util.*;

class Data{
    int d;
    Data(int d){
        this.d=d;
    }
    synchronized int read(){
        return d;
    }
    synchronized void write(int k){
        d=k;
    }
}
class OPSAllowed{
    int readC, writeC;
    OPSAllowed(){
        readC=0;
        writeC=0;
    }
    int SyncRead(Data dat){
        System.out.println("Reading");
        synchronized(this){
        while(writeC!=0)
            try{
                wait();
            }catch(Exception e){}
            readC++;
        }
        int r = dat.read();
        System.out.println("Read value: "+r);
        synchronized(this){
            readC--;
            notifyAll();
        }
        System.out.println("Read Complete");
        return r;
    }
    void SyncWrite(Data d,int k){
        System.out.println("Writing");
        synchronized(this){
        while(writeC!=0 && readC!=0){
            try{
                wait();
            }
            catch(Exception e){}
        }
            writeC++;
        }
        d.write(k);
        synchronized(this){
            writeC--;
            notifyAll();
        }
        System.out.println("Writing Done");
    }

}
class Reader implements Runnable{
    Data d;
    OPSAllowed ops;
    Reader(Data dat, OPSAllowed opp){
        d=dat;
        ops=opp;
    }
    public void run(){
        int dd=ops.SyncRead(d);
    }
}
class Writer implements Runnable{
    Data d;
    OPSAllowed ops;
    Writer(Data dat, OPSAllowed opp){
        d=dat;
        ops=opp;
    }
    public void run(){
        ops.SyncWrite(d,50);
    }
}

public class Reader_Writer {
    public static void main(String[] args) {
        Data d= new Data(79);
        OPSAllowed op = new OPSAllowed();
        Thread r = new Thread(new Reader(d,op));
        Thread w = new Thread(new Writer(d, op));

        r.start();
        w.start();

    }
}
