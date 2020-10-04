import java.util.*;
class Address{
	private int pNum;
	private String street,city,pin,state;
	Address(){
		pNum=0;
		street="";
		city="";
		pin="";
		state="";
	}
	public void getAddress(){
		Scanner in=new Scanner(System.in);
		System.out.print("Premises: ");
		pNum=in.nextInt();
		System.out.print("Street: ");
		street=in.next();
		System.out.print("city: ");
		city=in.next();
		System.out.print("State: ");
		state=in.next();
		
	}
	public void print(){
		System.out.println("Premises: "+pNum+" street:  "+street+" City: "+city+" State: "+state);
	}
	
}


abstract class Individual{
	public String name,ph_num,email;
	Address a;
	Individual(){
		a=new Address();
	}
	public void setInput(){
		a.getAddress();
		Scanner in=new Scanner(System.in);
		System.out.print("Name: ");
		name=in.nextLine();
		System.out.print("Ph_num: ");
		ph_num=in.next();
		System.out.print("email: ");
		email=in.next();
	}
	public void print(){
		a.print();
		System.out.println("Name: "+name+" phone: "+ph_num+" email: "+email);
	}
}

class Student extends Individual{
	String roll,course;
	public void set(){
		super.setInput();
		Scanner in=new Scanner(System.in);
		System.out.print("roll: ");
		roll=in.next();
		System.out.print("Course: ");
		course=in.next();
	}
	public void print(){
		super.print();
		System.out.println("roll: "+roll+" course: "+course);
	}
	
}

class faculty extends Individual{
	String dept,employee_id,specilization;
	public void set(){
		this.setInput();
		Scanner in=new Scanner(System.in);
		System.out.print("Dept: ");
		dept=in.next();
		System.out.print("emp_id: ");
		employee_id=in.next();
		System.out.print("Specilization: ");
		specilization=in.next();
	}
	public void print(){
		super.print();
		System.out.println("Name: "+dept+" emp_id: "+employee_id+" Specilization: "+specilization);
		System.out.println("\n----------------------------------\n");
	}
	
}
class Assign2{
	public static void main(String args[]){
		Student s=new Student();
		s.set();
		s.print();
		faculty f=new faculty();
		f.set();
		f.print();
	}
}
