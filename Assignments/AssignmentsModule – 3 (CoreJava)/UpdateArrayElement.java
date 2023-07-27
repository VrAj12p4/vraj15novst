//20.


package AssignmentModule3;

import java.util.Arrays;
import java.util.Scanner;

public class UpdateArrayElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        int[] arr = { 10, 20, 30, 40, 50 };

        System.out.println("Original Array: " + Arrays.toString(arr));

        System.out.print("Enter the index of the element to update (0 to " + (arr.length - 1) + "): ");
        int index = scanner.nextInt();

        if (index < 0 || index >= arr.length) {
            System.out.println("Invalid index. Please enter a valid index within the range.");
        } else {
            System.out.print("Enter the new element: ");
            int newElement = scanner.nextInt();

            
            arr[index] = newElement;

            System.out.println("Updated Array: " + Arrays.toString(arr));
        }

        scanner.close();
    }
}

