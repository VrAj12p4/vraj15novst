//19.


package AssignmentModule3;

import java.util.ArrayList;

public class ArrayListIteration {
    public static void main(String[] args) {
        // Create an ArrayList of integers
        ArrayList<Integer> numbers = new ArrayList<>();

        // Add elements to the ArrayList
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        // Using for-each loop to iterate through the ArrayList
        System.out.println("Using for-each loop:");
        for (int num : numbers) {
            System.out.println(num);
        }

        // Using regular for loop to iterate through the ArrayList
        System.out.println("\nUsing regular for loop:");
        for (int i = 0; i < numbers.size(); i++) {
            int num = numbers.get(i);
            System.out.println(num);
        }
    }
}

