package com.ThridDay;
 class Animal {
    private String name;
    private int age;
    
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public String getName() {
        return this.name;
    }
    
    public int getAge() {
        return this.age;
    }
    
    public void eat() {
        System.out.println("Eating...");
    }

	public void nurse() {
		
	}

	public void fly() {
		
	}

	public void swim() {
		
		
	}
}

class Mammal extends Animal {
    private String furColor;
    
    public Mammal(String name, int age, String furColor) {
        super(name, age);
        this.furColor = furColor;
    }
    
    public String getFurColor() {
        return this.furColor;
    }
    
    public void nurse() {
        System.out.println("Nursing young...");
    }
}

class Bird extends Animal {
    private double wingspan;
    
    public Bird(String name, int age, double wingspan) {
        super(name, age);
        this.wingspan = wingspan;
    }
    
    public double getWingspan() {
        return this.wingspan;
    }
    
    public void fly() {
        System.out.println("Flying...");
    }
}

class Fish extends Animal {
    private String habitat;
    
    public Fish(String name, int age, String habitat) {
        super(name, age);
        this.habitat = habitat;
    }
    
    public String getHabitat() {
        return this.habitat;
    }
    
    public void swim() {
        System.out.println("Swimming...");
    }
}

public class AnimalDemo {
	public static void main(String args[]) {
		Animal animal1 = new Mammal("Cat", 3, "Gray");
		Animal animal2 = new Bird("Eagle", 5, 6.5);
		Animal animal3 = new Fish("Salmon", 1, "River");

		animal1.nurse(); // Output: Nursing young...
		animal2.fly(); // Output: Flying...
		animal3.swim(); // Output: Swimming...

	}

}
