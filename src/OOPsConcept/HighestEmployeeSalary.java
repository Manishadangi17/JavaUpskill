package OOPsConcept;

import java.util.Scanner;

class Employee{
	 int id;
	 String name;
	 double salary;
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	 
	 
 }
public class HighestEmployeeSalary {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int sal1 = in.nextInt();
		System.out.print("Enter salary first");
		int sal2 = in.nextInt();
		System.out.print("Enter salary second");
		int sal3 = in.nextInt();
		System.out.print("Enter salary thrid");
		
		
	}

}
