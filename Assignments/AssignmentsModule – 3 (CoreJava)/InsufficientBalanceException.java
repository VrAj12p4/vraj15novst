//27.

package AssignmentModule3;



class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

class BankAccount {
    private int balance;

    public BankAccount(int initialBalance) {
        this.balance = initialBalance;
    }

    public void withdraw(int amount) throws InsufficientBalanceException {
        if (amount > balance) {
            int requiredAmount = amount - balance;
            throw new InsufficientBalanceException("Sorry, insufficient balance. You need more " + requiredAmount + " Rs.");
        } else {
            balance -= amount;
            System.out.println("Amount of " + amount + " Rs has been deducted from your account.");
        }
    }
}



