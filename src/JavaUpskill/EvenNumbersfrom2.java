package JavaUpskill;

import java.util.Scanner;

public class EvenNumbersfrom2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int num = sc.nextInt();
		for(int i =2; i<=num; i+=2) {
			System.out.println(i + " ");
		}
		
		
				
	}

}
