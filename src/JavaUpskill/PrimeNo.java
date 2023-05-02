package JavaUpskill;

import java.util.Scanner;

public class PrimeNo {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a positive integer: ");
		int num = in.nextInt();
		int i =1;
		boolean isPrime = true;
		
        while (i <= num / 2) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
            i++;
        }
        if (isPrime) {
            System.out.println(num + " is a prime number");
        } else {
            System.out.println(num + " is not a prime number");
        }
		
	}

}
