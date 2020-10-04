
class StudentClass{
    
    public static void main(String[] args) {
        StudentClass ss=new StudentClass();
        ss.start();
        Student s=new Student();
        s.set("Bisakh mondal","079",100);
        s.display();
    }
    public void start(){
        Student s=new Student();
        s.set("Bisakh","079",100);
        s.display();
        Student s1=s;//shallow copy
        s1.score=96;
        s.display();

    }
}
class Student{
    /*private*/ int score;
    private String roll,name;
    public void set(String name,String roll,int score){
        this.setRoll(roll);
        this.setName(name);
        this.score=score;
    }
    public void display(){
        System.out.println("Name: "+getName()+" Roll: "+getRoll()+" :score: "+score);
    }
    public void copy(Student c){
        score=c.score;
        setRoll(c.getRoll());
        setName(c.getName());
    }
    public int getScore() {
		return score;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRoll() {
		return roll;
	}
	public void setRoll(String roll) {
		this.roll = roll;
	}
	public void setScore(int score) {
		this.score = score;
	}
}

