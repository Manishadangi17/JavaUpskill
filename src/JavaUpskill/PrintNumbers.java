package JavaUpskill;

import java.util.Scanner;

public class PrintNumbers {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the Valaue:");
		int num = in.nextInt();
		
		for (int i = 1; i <= num; i++) {
            System.out.println(i + " ");
        }
		
	}
}
