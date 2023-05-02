package ExceptionDemo;

import java.util.Scanner;

public class FiestDemo {
	
public static void main(String args[]) throws ArithmeticException {
	
		int a = 6;
		Scanner sc = new Scanner(System.in);
		int b = sc.nextInt();
		if(b<1) {
		throw new ArithmeticException();
		//	throw new IOException("sorryerror"); 
		}
		else {
		System.out.println(a/b);}
}

}
