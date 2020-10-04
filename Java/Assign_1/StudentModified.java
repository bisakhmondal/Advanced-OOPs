
class StudentModified{
    
    public static void main(String[] args) {
        
        Student s=new Student();
        s.setName("Bisakh");
        s.setScore(100);
        s.setRoll("079");
        s.display();
        Student s1=s;//shallow copy
        s1.score=96;
        s.display();
        Student s2=new Student(s);//Deep copy
        s2.score=9;
        s.display();
    }
}
class Student{
     int score;
    private String roll,name;
    Student(String roll){
        this.roll=roll;
    }
    Student(String roll,String name){
        this.roll=roll;
        this.name=name;
    }
    Student(String roll,String name,int score){
        this.roll=roll;
        this.name=name; this.score=score;
    }
    Student(){};

    Student(Student c){
        name=c.name;
        roll=c.roll;
        score=c.score;
    }
    public void display(){
        System.out.println("Name: "+name+" Roll: "+roll+" :score: "+score);
    }
    public void copy(Student c){
        score=c.score;
        roll=c.roll;
        name=c.name;
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