// Create a class named 'Member' having the following members:
//Data members
//Name
//Age
//Phone number
//Address 5 - Salary
//It also has a method named 'printSalary' which prints the salary of the
//members.
//Two classes 'Employee' and 'Manager' inherits the 'Member' class. The
//'Employee' and 'Manager' classes have data members 'specialization' and
//'department' respectively. Now, assign name, age, phone number,
//address and salary to an employee and a manager by making an object of
//both of these classes and print the same.

package modual2;

class Member
{
	 
	String name;
	int age;
	String PhoneNumber;
	String address;
	double salary;
	
	public Member(String name,int age,String PhoneNumber,String address,double salary)
	{
		this.name=name;
		this.age=age;
		this.PhoneNumber=PhoneNumber;
		this.address=address;
		this.salary=salary;
		
	}
	public void printSalary()
	{
		System.out.println("salary"+salary);
	}
}

 class Employee extends Member
{
      private  String department; 
	public Employee(String name, int age, String PhoneNumber, String address, double salary,String department) {
		super(name, age, PhoneNumber, address, salary);
		this.department=department;
		
	}
}
class Mannager extends Member
{
private String specialization;
	public Mannager(String name, int age, String PhoneNumber, String address, double salary,String specialization) {
		super(name, age, PhoneNumber, address, salary);
		this.specialization=specialization;
		
	}
}

public class MemberClass {
	
	public static void main(String[] args) 
	{
		Employee employee=new Employee("aferf",12,"1234567890","near bus stand",185000,"it");
		employee.printSalary();
		Mannager mannager=new Mannager("adgegtrf",52,"12345275527890","near baliii stand",195000,"it");
		mannager.printSalary();
	}
}
