//24.


package AssignmentModule3;

import java.util.Scanner;

public class SecondLargestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");

       
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        
        int secondLargest = findSecondLargest(arr);

        System.out.println("The second largest element in the array is: " + secondLargest);

        scanner.close();
    }

    public static int findSecondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num < largest) {
                
                secondLargest = num;
            }
        }

        return secondLargest;
    }
}

