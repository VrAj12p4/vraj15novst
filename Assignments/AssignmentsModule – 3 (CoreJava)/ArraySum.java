//9.

package AssignmentModule3;

public class ArraySum {
	public static void main(String[] args) {
		int[] array = { 5, 10, 15, 20, 25 };

		int sum = calculateSum(array);

		System.out.println("Sum of the array: " + sum);
	}

	public static int calculateSum(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
}
