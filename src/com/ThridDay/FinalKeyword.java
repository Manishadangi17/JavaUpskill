package com.ThridDay;

public class FinalKeyword {
	public static void main(String[] args) {

		final int MAX_VALUE = 100;
		FinalClass obj = new FinalClass();

		obj.finalMethod();

	}
}

final class FinalClass {

	public final void finalMethod() {
		System.out.println("This method cannot be overridden");
	}
}
