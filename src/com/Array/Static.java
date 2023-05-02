package com.Array;

import java.util.Iterator;

public class Static  {
		  public static void myMethod() {
		    final int myStaticVariable = 4; // This is not allowed in Java
		    for(int i=0;i<myStaticVariable-2;i++) {
		    	System.out.println(myStaticVariable);
		    }
		    System.out.println("Static variable value: " + myStaticVariable);
		  }

		  public static void main(String[] args) {
		    myMethod();
		    myMethod();
		    myMethod();
		  }
		}



