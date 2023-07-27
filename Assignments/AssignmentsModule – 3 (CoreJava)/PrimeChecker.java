//4.

package AssignmentModule3;

import java.util.Scanner;

public class PrimeChecker {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a positive integer: ");

		int number = scanner.nextInt();
		if (number <= 1) {
			System.out.println("Prime numbers are greater than 1.");
		} else {
			boolean isPrime = isNumberPrime(number);
			if (isPrime) {
				System.out.println(number + " is a prime number.");
			} else {
				System.out.println(number + " is not a prime number.");
			}
		}

		scanner.close();
	}

	public static boolean isNumberPrime(int n) {
		if (n <= 1) {
			return false;
		} else if (n <= 3) {
			return true;
		} else if (n % 2 == 0 || n % 3 == 0) {
			return false;
		}

		int i = 5;
		while (i * i <= n) {
			if (n % i == 0 || n % (i + 2) == 0) {
				return false;
			}
			i += 6;
		}

		return true;
	}
}
