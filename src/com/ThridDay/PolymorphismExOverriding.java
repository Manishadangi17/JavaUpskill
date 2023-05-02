package com.ThridDay;
class Parente {
	 
    void Print()
    {
        System.out.println("parent class");
    }
}
class subclass1 extends Parente {
 
    void Print() { System.out.println("subclass1"); }
}
 
class subclass2 extends Parente {
    void Print()
    {
        System.out.println("subclass2");
    }
}
public class PolymorphismExOverriding {
    public static void main(String[] args)
    {
    	Parente  a = new subclass1();
        a.Print();
 
        a = new subclass2();
        a.Print();
    }

}
