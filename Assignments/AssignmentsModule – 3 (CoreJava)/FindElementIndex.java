//11.

package AssignmentModule3;

import java.util.Scanner;

public class FindElementIndex {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of elements in the array: ");
		int n = scanner.nextInt();

		
		int[] arr = new int[n];

		System.out.println("Enter the elements of the array:");

		
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}

		System.out.print("Enter the element to find its index: ");
		int target = scanner.nextInt();

		
		int index = -1; 
		for (int i = 0; i < n; i++) {
			if (arr[i] == target) {
				index = i;
				break; 
			}
		}

		if (index != -1) {
			System.out.println("Element " + target + " found at index " + index);
		} else {
			System.out.println("Element not found in the array.");
		}

		scanner.close();
	}
}
