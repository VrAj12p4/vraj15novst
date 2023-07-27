//22.

package AssignmentModule3;

import java.util.Arrays;

public class CopyArray {
    public static void main(String[] args) {
        
        int[] originalArray = { 10, 20, 30, 40, 50 };

        
        int[] copiedArray1 = new int[originalArray.length];
        for (int i = 0; i < originalArray.length; i++) {
            copiedArray1[i] = originalArray[i];
        }

       
        int[] copiedArray2 = new int[originalArray.length];
        System.arraycopy(originalArray, 0, copiedArray2, 0, originalArray.length);

        
        System.out.println("Original Array: " + Arrays.toString(originalArray));
        System.out.println("Copied Array (Using loop): " + Arrays.toString(copiedArray1));
        System.out.println("Copied Array (Using System.arraycopy()): " + Arrays.toString(copiedArray2));
    }
}
