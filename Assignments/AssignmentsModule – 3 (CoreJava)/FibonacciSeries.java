//6.
package AssignmentModule3;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of terms in the Fibonacci series: ");

		int numTerms = scanner.nextInt();
		if (numTerms <= 0) {
			System.out.println("Number of terms should be greater than 0.");
		} else {
			System.out.println("Fibonacci Series:");
			printFibonacciSeries(numTerms);
		}

		scanner.close();
	}

	public static void printFibonacciSeries(int n) {
		int firstTerm = 0;
		int secondTerm = 1;

		for (int i = 0; i < n; i++) {
			System.out.print(firstTerm + " ");
			int nextTerm = firstTerm + secondTerm;
			firstTerm = secondTerm;
			secondTerm = nextTerm;
		}
	}
}
