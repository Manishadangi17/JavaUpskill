package SecondDay;

import java.util.Scanner;

public class FibonacciSequence {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a integer: ");
		int num = in.nextInt();
		int a=0;
		int b=1;
		int c=0;
		System.out.print("Fibonacci Series " + num + ": ");
		while(a<=num) {
			System.out.print(a + " ");
			c=a+b;
			a=b;
			b=c;
			
		}
		
		
		
	}

}
