//16.

package AssignmentModule3;

import java.util.Scanner;

public class MultipleCatchDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a number: ");
            int num1 = Integer.parseInt(scanner.nextLine());

            System.out.print("Enter another number: ");
            int num2 = Integer.parseInt(scanner.nextLine());

            
            int result = num1 / num2;
            System.out.println("Result: " + result);


            int[] arr = { 1, 2, 3 };
            System.out.println("Array element at index 5: " + arr[5]);
        } catch (ArithmeticException ex) {
            System.out.println("Error: Cannot divide by zero.");
        } catch (NumberFormatException ex) {
            System.out.println("Error: Invalid input. Please enter valid integers.");
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Error: Array index is out of bounds.");
        } catch (Exception ex) {
            System.out.println("An unexpected error occurred: " + ex.getMessage());
        } finally {
            System.out.println("Finally block executed.");
        }

        scanner.close();
    }
}

