package com.ThridDay;

class Aa {
	void m1() {
		System.out.println("Inside A's m1 method");
	}
}

class B extends Aa {
	void m1() {
		System.out.println("Inside B's m1 method");
	}
}

class C extends Aa {
	void m1() {
		System.out.println("Inside C's m1 method");
	}
}

public class DispatchMethod {
	public static void main(String args[]) {
		Aa a = new Aa();
		B b = new B();
		C c = new C();
		Aa ref;
		ref = a;
		ref.m1();
		ref = b;
		ref.m1();
		ref = c;
		ref.m1();
	}

}
