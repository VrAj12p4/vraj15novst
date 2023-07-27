//13.

package AssignmentModule3;

import java.util.Scanner;

public class CompareStrings {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the first string: ");
		String str1 = scanner.nextLine();

		System.out.print("Enter the second string: ");
		String str2 = scanner.nextLine();

		
		boolean areEqualUsingEquals = str1.equals(str2);

		
		int compareResult = str1.compareTo(str2);
		String compareOutput;

		if (compareResult == 0) {
			compareOutput = "equal to";
		} else if (compareResult < 0) {
			compareOutput = "less than";
		} else {
			compareOutput = "greater than";
		}

		System.out.println(
				"Comparison using equals(): The two strings are " + (areEqualUsingEquals ? "equal." : "not equal."));
		System.out
				.println("Comparison using compareTo(): The first string is " + compareOutput + " the second string.");

		scanner.close();
	}
}
