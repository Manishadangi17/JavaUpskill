package JavaUpskill;

import java.util.Scanner;

public class Largestone {
	public static void main(String args[]) {
		System.out.println("Enter the three Number");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
//		if(num1 >= num2 && num1 >= num3) {
//			System.out.print(num1 + " is largest one");
//		} else if(num2 >= num3 && num2 >= num1) {
//			System.out.print(num1 + " is largest one");
//		}
//		 else if(num3 >= num1 && num3 >= num2) {
//				System.out.print(num1 + " is largest one");
//			}
		
		int temp = num1;
		if(num2>temp) {
			temp=num2;
		}
		if(num3>temp) {
			temp=num3;
		}
		  System.out.println("The largest number is " + temp);
	}
}