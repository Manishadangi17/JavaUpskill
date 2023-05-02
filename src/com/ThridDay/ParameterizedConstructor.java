package com.ThridDay;

class Student2 {
	int id;
	String name;

	public Student2(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	void display() {
		System.out.println(id + " " + name);
	}
}

public class ParameterizedConstructor {
	public static void main(String args[]) {

		Student2 s1 = new Student2(1, "Mani");
		Student2 s2 = new Student2(2, "Mannu");

		s1.display();
		s2.display();
	}
}
