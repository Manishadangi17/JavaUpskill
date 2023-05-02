package JavaUpskill;

import java.util.Scanner;

public class SumAllNo {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a integer: ");
		int num = sc.nextInt();
		int sum=0;
		int i=1;
		do {
			sum+=i;
			i++;
					
		}while(i<=num); {
			 System.out.println("Sum of numbers from 1 to " + num + ": " + sum);
			
		}
		
				
	}
}
