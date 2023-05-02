package com.ThridDay;

class Animall {
    public void makeSound() {
        System.out.println("The Animall makes a sound.");
    }
}

class Dog extends Animall {
    @Override
    public void makeSound() {
        System.out.println("The dog barks.");
    }
}

class Cat extends Animall {
    @Override
    public void makeSound() {
        System.out.println("The cat meows.");
    }
}

public class DemonstratePolymorphis  {
    public static void main(String[] args) {
        Animall Animall1 = new Animall();
        Animall Animall2 = new Dog();
        Animall Animall3 = new Cat();

        Animall1.makeSound(); 
        Animall2.makeSound(); 
        Animall3.makeSound(); 
    }
}




