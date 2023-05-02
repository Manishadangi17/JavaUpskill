package com.ThridDay;
class Employee {
    private String name;
    private int age;
    private String department;
    private double salary;
    
    public Employee(String name, int age, String department, double salary) {
        this.name = name;
        this.age = age;
        this.department = department;
        this.salary = salary;
    }
    
    public String getName() {
        return this.name;
    }
    
    public int getAge() {
        return this.age;
    }
    
    public String getDepartment() {
        return this.department;
    }
    
    public double getSalary() {
        return this.salary;
    }
    
    public void work() {
        System.out.println("Working...");
    }

	public void hire() {
	
	}

	public void learn() {
	
	}
}

class Manager extends Employee {
    private String title;
    
    public Manager(String name, int age, String department, double salary, String title) {
        super(name, age, department, salary);
        this.title = title;
    }
    
    public String getTitle() {
        return this.title;
    }
    
    public void hire() {
        System.out.println("Hiring employees...");
    }
}

class Engineer extends Employee {
    private String field;
    
    public Engineer(String name, int age, String department, double salary, String field) {
        super(name, age, department, salary);
        this.field = field;
    }
    
    public String getField() {
        return this.field;
    }
    
    public void code() {
        System.out.println("Coding...");
    }
}
class Intern extends Employee {
    private String school;
    
    public Intern(String name, int age, String department, double salary, String school) {
        super(name, age, department, salary);
        this.school = school;
    }
    
    public String getSchool() {
        return this.school;
    }
    
    public void learn() {
        System.out.println("Learning...");
    }
}

public class EmployeeDemo {
	public static void main(String args[]) {
		Employee employee1 = new Manager("John Doe", 35, "Sales", 100000.0, "Sales Manager");
		Employee employee2 = new Engineer("Jane Smith", 28, "Engineering", 80000.0, "Software Development");
		Employee employee3 = new Intern("Bob Johnson", 20, "Marketing", 20000.0, "University of XYZ");

		employee1.hire(); 
		employee2.hashCode(); 
		employee3.learn(); 

	}

}
