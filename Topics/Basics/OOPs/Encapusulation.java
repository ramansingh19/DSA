package OOPs;

public class Encapusulation {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("Raman", 5000);

        // accessing data only through methods
        System.out.println("Holder: " + acc.getAccountHolder());
        System.out.println("Balance: " + acc.getBalance());

        acc.deposit(2000);
        System.out.println("Updated Balance: " + acc.getBalance());

        acc.withdraw(8000); // invalid, will be handled
    }
}

class BankAccount {
    // private data (hidden from outside)
    private String accountHolder;
    private double balance;

    // Constructor
    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Getter (read-only access)
    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    // Setter / Controlled access
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount <= balance && amount > 0) {
            balance -= amount;
        } else {
            System.out.println("Invalid withdrawal.");
        }
    }
}

