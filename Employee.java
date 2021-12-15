import java.io.*; 

public class Employee{
	private String fname;
	private String lname;
	private double salary; 
	Employee(){
		fname=null;
		lname=null;
		salary=0.0;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		if(salary<0)
			this.salary=0.0;
		else 
			this.salary=salary*12;
	}

}


-----------------

public class Employeetest{
	public static void main(String[] args) {
	Employee e1 = new Employee();
	e1.setFname("Raj");
	e1.setLname("shah");
	e1.setSalary(380000);

	Employee e2 = new Employee();
	e2.setFname("Akash");
	e2.setLname("dadge");
	e2.setSalary(320000);

	System.out.println("Details of 1st Employee"
			+"\nName:"+e1.getFname()+" "+e1.getLname()
			+"\nYearly Salary:"+e1.getSalary());
	System.out.println("\nDetails of 2nd Employee"
			+"\nName:"+e2.getFname()+" "+e2.getLname()
			+"\nYearly Salary:"+e2.getSalary());

	System.out.println("\nAfter 10% raise  salary\nDetails of 1st Employee"
			+"\nName:"+e1.getFname()+" "+e1.getLname()
			+"\nYearly Salary:"+e1.getSalary()*1.1);
	System.out.println("\nDetails of 2nd Employee"
			+"\nName:"+e2.getFname()+" "+e2.getLname()
			+"\nYearly Salary:"+e2.getSalary()*1.1);
	}
}

