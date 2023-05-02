package com.ThridDay;

public class ToStringMethod {
	    public static void main(String[] args) {
	        Perso perso = new Perso("John", 30);
	        String personStr = perso.toString();
	        System.out.println("Person object string representation: " + personStr);
	    }
	}

	class Perso {
	    private String name;
	    private int age;

	    public Perso(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	    @Override
	    public String toString() {
	        return "Person{name='" + name + "', age=" + age + "}";
	    }
	}



