//14.

package AssignmentModule3;

import java.util.Scanner;

public class ConcatenateStrings {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the first string: ");
		String str1 = scanner.nextLine();

		System.out.print("Enter the string to be concatenated: ");
		String str2 = scanner.nextLine();

		String concatenatedString1 = str1 + str2;

		String concatenatedString2 = str1.concat(str2);

		System.out.println("Concatenated String using + operator: " + concatenatedString1);
		System.out.println("Concatenated String using concat() method: " + concatenatedString2);

		scanner.close();
	}
}
