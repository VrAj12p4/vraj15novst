//5.

package AssignmentModule3;

import java.util.Scanner;

public class ArmstrongChecker {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a positive integer: ");

		int number = scanner.nextInt();
		if (number <= 0) {
			System.out.println("Please enter a positive number.");
		} else {
			boolean isArmstrong = isNumberArmstrong(number);
			if (isArmstrong) {
				System.out.println(number + " is an Armstrong number.");
			} else {
				System.out.println(number + " is not an Armstrong number.");
			}
		}

		scanner.close();
	}

	public static boolean isNumberArmstrong(int n) {
		int originalNumber = n;
		int numDigits = String.valueOf(n).length();
		int sum = 0;

		while (n > 0) {
			int digit = n % 10;
			sum += Math.pow(digit, numDigits);
			n /= 10;
		}

		return sum == originalNumber;
	}
}
