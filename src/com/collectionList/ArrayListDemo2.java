package com.collectionList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;

public class ArrayListDemo2 {
	public static void main(String[] args) {
		ArrayList<String> name = new ArrayList<String>();
        name.add("Manisha");
        name.add("Depali");
        name.add("Ajay");
        name.add("Vipin");
        name.add("Kavya");
        name.add("Neeti");
        
        Collections.sort(name);
        
        System.out.println(name);
        
        System.out.println("original Size of ArrayList : " + name.size());
        
        
        //
//        for(String n : name) {
//        	System.out.println(n);
//        	
//        }
        //Iterating over ArrayList in Java
        
        Iterator<String> itr = name.iterator();
        while(itr.hasNext()) {
        	System.out.println(" Removing " + itr.next() + "  from Arraylist ");
        	itr.remove();
        	
        }
        System.out.println("final Size of ArrayList : " + name.size());


	}

}
