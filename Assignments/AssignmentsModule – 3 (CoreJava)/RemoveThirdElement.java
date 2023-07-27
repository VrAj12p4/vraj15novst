//21.


package AssignmentModule3;

import java.util.ArrayList;

public class RemoveThirdElement {
    public static void main(String[] args) {
       
        ArrayList<Integer> numbers = new ArrayList<>();

       
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

      
        System.out.println("Original ArrayList: " + numbers);

       
        if (numbers.size() >= 3) {
            numbers.remove(2);
            System.out.println("After removing the third element: " + numbers);
        } else {
            System.out.println("The ArrayList does not have a third element to remove.");
        }
    }
}


