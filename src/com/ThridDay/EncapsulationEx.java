package com.ThridDay;

class Man {
	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}

public class EncapsulationEx {
	public static void main(String[] args) {
		Man Man = new Man();
		Man.setName("John");
		Man.setAge(30);

		System.out.println("Name: " + Man.getName());
		System.out.println("Age: " + Man.getAge());
	}

}
