//23.


package AssignmentModule3;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        
        int[] originalArray = { 10, 20, 30, 40, 50 };

        
        reverseArray(originalArray);

        
        System.out.println("Reversed Array: " + Arrays.toString(originalArray));
    }

    public static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            
            start++;
            end--;
        }
    }
}

