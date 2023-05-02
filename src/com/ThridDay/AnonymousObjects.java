package com.ThridDay;

class Person1 {
    
    private String name;
    
    public Person1(String name) {
        this.name = name;
    }
    
    public void sayHello() {
        System.out.println("Hello, my name is " + name);
    }
}
	
	public class AnonymousObjects {
	
		public static void main(String[] args) {
	        new Person1("Manisha").sayHello();   
	        new Person1("man").sayHello();
	        
	       
	    }
	}
	  
