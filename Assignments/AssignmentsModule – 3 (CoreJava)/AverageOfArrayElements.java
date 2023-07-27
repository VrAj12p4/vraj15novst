//10.

package AssignmentModule3;

import java.util.Scanner;

public class AverageOfArrayElements {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of elements in the array: ");
		int n = scanner.nextInt();

		int[] arr = new int[n];

		System.out.println("Enter the elements of the array:");

		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}

		int sum = 0;
		for (int num : arr) {
			sum += num;
		}

		double average = (double) sum / n;

		System.out.println("The average value of the array elements is: " + average);

		scanner.close();
	}
}
