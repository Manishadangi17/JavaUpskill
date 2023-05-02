package JavaUpskill;

import java.util.Scanner;

public class ComparsionOp {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the first integer and second integer");
		int num1 = in.nextInt();
		int num2 = in.nextInt();
		if(num1<num2) {
			System.out.print(num1 + " is less than " + num2);
		}
		else if(num1>num2) {
			System.out.print(num1 + " is greater than " + num2);
			
		}
		else {
			System.out.print(num1 + " is equal to " + num2);
		}
		
	}

}
