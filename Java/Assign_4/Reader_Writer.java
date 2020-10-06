import java.util.*;

class Data{
    int d;
    Data(int d){
        this.d=d;
    }
    synchronized int read(){
        System.out.println("read");
        return d;
    }
    synchronized void write(int k){

        System.out.println("Wrote");
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
        synchronized(this){
            while(writeC!=0){
            try{
                wait();
            }catch(Exception e){} 
        }
        readC++;
        }
        System.out.println("Reading ");
        int r = dat.read();
        System.out.println("Read value: "+r);
        System.out.println("Read Complete");
        synchronized(this){
            readC--;
            notifyAll();
        }
        return 0;
    }
    void SyncWrite(Data d,int k){
        synchronized(this){
            while(writeC!=0 || readC!=0){
                try{
                    wait();
                }
                catch(Exception e){}
            }
            writeC++;
        }
        System.out.println("Writing");
        d.write(k);
        System.out.println("Writing Done");
        synchronized(this){
            writeC--;
            notifyAll();
        }
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
        Thread r2 = new Thread(()->{
            op.SyncRead(d);
        });
        Thread w2 = new Thread(()->{
            op.SyncWrite(d,45);
        });
        w2.start();
        r2.start();
        r.start();
        w.start();
    }
}
