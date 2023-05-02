package SecondDay;

import java.util.Scanner;

public class ArmstrongNum {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = input.nextInt();
		int temp = num;
		int sum = 0;
		int power = String.valueOf(num).length();

		while (temp > 0) {
			int digit = temp % 10;
			sum += Math.pow(digit, power);
			temp /= 10;
		}

		if (num == sum) {
			System.out.println(num + " is an Armstrong number.");
		} else {
			System.out.println(num + " is not an Armstrong number.");
		}

		int result = 0;
		while (num > 9) {
			result = 0;
			while (num > 0) {
				result += num % 10;
				num /= 10;
			}
			num = result;
		}

		if (num == 1) {
			System.out.println(num + " is a Magic number.");
		} else {
			System.out.println(num + " is not a Magic number.");
		}
	}
}
