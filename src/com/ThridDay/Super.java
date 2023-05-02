package com.ThridDay;

class Person {
	void message() {
		System.out.println("This is person class\n");
	}
}

class Person2 extends Person {
	void message() {
		System.out.println("This is Person2 class");
	}

	void display() {

		message();
		super.message();
	}
}

public class Super {
	public static void main(String args[]) {
		Person2 s = new Person2();
		s.display();
	}
}
