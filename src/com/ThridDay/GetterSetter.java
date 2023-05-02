package com.ThridDay;
class Personn {
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
public class GetterSetter {
	public static void main(String[] args) {
        Personn personn = new Personn();

        personn.setName("John");
        personn.setAge(30);
        System.out.println("Name: " + personn.getName());
        System.out.println("Age: " + personn.getAge());
    }
}
