package OOP;

class BankAccount {
    private double balance;

    // Getter method to access the balance (read-only)
    public double getBalance() {
        return balance;
    }

    // Setter method to update the balance (write-only)
    public void setBalance(double newBalance) {
        if (newBalance >= 0) {
            balance = newBalance;
        }
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }
}