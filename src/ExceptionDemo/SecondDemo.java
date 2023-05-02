package ExceptionDemo;

import java.util.Scanner;

public class SecondDemo {

public static void main(String args[]) throws ArithmeticException {
	try {
		int a = 6;
		Scanner sc = new Scanner(System.in);
		int b = sc.nextInt();
		if(b<1) {
			throw new ArithmeticException();
		}
		else {
		System.out.println(a/b);}
		
	}
	catch(ArithmeticException f) {
		System.out.println(f.getMessage());
	}
	catch(Exception e) {
		System.out.println(e.getMessage());
	}
	
	finally {
		System.out.println("dina");
	}

}
}
