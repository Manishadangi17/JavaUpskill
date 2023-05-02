package JavaUpskill;

import java.util.Scanner;

public class PrintEvenNumbers {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the Valaue:");
		int num = in.nextInt();
		
//		for (int i = 2; i <= num; i += 2)
		System.out.println("The even numbers from 2 to " + num + " are:");
		for(int i =2; i <=num; i++) {
			if(num%2==0) {
				System.out.println(i + " ");
			}
			i++;
		}

	}
}
