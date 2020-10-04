import java.util.*;
class Customer{
	public String name,ph;
	public int id;
	public double loan_taken;
	static double credit_limit=30000;
	static int id_gen=123456;
	Customer(){
		name="";
		ph="";
		id=id_gen + (int)(Math.random()*100);
		loan_taken=0.0;
	}

	public static double get_credit_limit(){
		return credit_limit;
	}
	double currentLoan(){
		return loan_taken;
	}
	double LoanSeek(){
		return Math.max(credit_limit-loan_taken,0);
	}
	void setName(String name){
		this.name=name;
	}
	void setPhone(String phone){
		this.ph=phone;
	}
	public void req_loan(double ammount){
		if(ammount+loan_taken>credit_limit){
			System.out.println("Your loan cant be granted!!");
		}
		else{
			loan_taken+=ammount;
			System.out.println("loan granted of rs: "+ ammount);
		}
		
	}
	
}
class Previleged extends Customer{
	//due to no polymorphic nature in data variable.
	static double credit_limit=45000;
	public static double get_credit_limit(){
		return credit_limit;
	}

	public void req_loan(double ammount){
		if(ammount+loan_taken>credit_limit){
			System.out.println("Your loan cant be granted!!");
		}
		else{
			loan_taken+=ammount;
			System.out.println("loan granted of rs: "+ ammount);
		}
		
	}
	double LoanSeek(){
		return Math.max(credit_limit-loan_taken,0);
	}
}
class Assign
{
	public static void main(String args[]){
		Customer c1=new Customer();
		Previleged p1=new Previleged();
		c1.req_loan(2000);
		System.out.println("credit limit of customer 1 "+c1.get_credit_limit()+" | Loan taken: "+c1.currentLoan()+ " | Max Seekable Loan: "+c1.LoanSeek());
		p1.req_loan(7500);
		System.out.println("credit limit of Previleged customer 1 "+p1.get_credit_limit()+" | Loan taken: "+p1.currentLoan()+ " | Max Seekable Loan: "+p1.LoanSeek());
		
		System.out.println("\nagain loan request\n");
		c1.req_loan(20000);
		System.out.println("Loan seek limit of customer 1 "+c1.LoanSeek());
		p1.req_loan(75000);
		System.out.println("Loan seek limit of Previleged customer 1 "+p1.LoanSeek());
	}
}