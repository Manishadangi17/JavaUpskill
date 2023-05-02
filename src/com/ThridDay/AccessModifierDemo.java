package com.ThridDay;

class MyyClass {
	public int publicProperty;
	private int privateProperty;
	protected int protectedProperty;

	public MyyClass(int a, int b, int c) {
		this.publicProperty = a;
		this.privateProperty = b;
		this.protectedProperty = c;
	}

	public int getPrivateProperty() {
		return this.privateProperty;
	}

	public void setPrivateProperty(int value) {
		this.privateProperty = value;
	}
}

public class AccessModifierDemo {
	public static void main(String[] args) {
		MyyClass obj = new MyyClass(1, 2, 3);

		System.out.println(obj.publicProperty);

		System.out.println(obj.protectedProperty);

		System.out.println(obj.getPrivateProperty());

		obj.setPrivateProperty(4);
		System.out.println(obj.getPrivateProperty());
	}
}
