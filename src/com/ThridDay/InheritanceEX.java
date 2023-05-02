package com.ThridDay;

class Per {

	protected String name;
	protected int age;

	public Per(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void sayHello() {
		System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
	}
}

class Per1 extends Per {

	private String major;

	public Per1(String name, int age, String major) {
		super(name, age); 
		this.major = major;
	}

	public void displayMajor() {
		System.out.println("My major is " + major);
	}
}

public class InheritanceEX {
	public static void main(String[] args) {
		Per1 Per1 = new Per1("John", 20, "Computer Science");
		Per1.sayHello();
		Per1.displayMajor();
	}

}
