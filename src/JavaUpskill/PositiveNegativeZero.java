package JavaUpskill;

import java.util.Scanner;

public class PositiveNegativeZero {
	public static void main(String args[]) {
		System.out.println("Enter the Number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if(num >0 ) {
			System.out.print(num+ " is positive ");
		}else if(num < 0) {
			System.out.print(num+ " is Negative ");	
		}else {
			System.out.print(num+ " is equal Zero");
			
		}
	}

}
