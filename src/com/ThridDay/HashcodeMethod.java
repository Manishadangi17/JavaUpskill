package com.ThridDay;

public class HashcodeMethod {
	    public static void main(String[] args) {
	        MyClass obj1 = new MyClass(5, "Hello");
	        MyClass obj2 = new MyClass(5, "Hello");

	        System.out.println("Hashcode of obj1: " + obj1.hashCode());
	        System.out.println("Hashcode of obj2: " + obj2.hashCode());
	    }
	}

	class MyClass {
	    private int value;
	    private String message;

	    public MyClass(int value, String message) {
	        this.value = value;
	        this.message = message;
	    }

	    @Override
	    public int hashCode() {
	        final int prime = 31;
	        int result = 1;
	        result = prime * result + value;
	        result = prime * result + ((message == null) ? 0 : message.hashCode());
	        return result;
	    }
	}



