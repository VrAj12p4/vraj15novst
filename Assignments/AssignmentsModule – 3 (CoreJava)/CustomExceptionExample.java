//27.


package AssignmentModule3;

import java.util.Scanner;

public class CustomExceptionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BankAccount account = new BankAccount(2000);

        System.out.print("Enter withdraw amount: ");
        int withdrawAmount = scanner.nextInt();

        try {
            account.withdraw(withdrawAmount);
        } catch (InsufficientBalanceException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Transaction failed.");
        }

        scanner.close();
    }
}
