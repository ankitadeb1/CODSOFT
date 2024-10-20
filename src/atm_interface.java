import java.util.*;

// Represents the user's bank account
class BankAccount {
    private double balance;

    // Initialize with an opening balance
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // Get the current balance
    public double getBalance() {
        return balance;
    }

    // Deposit money into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("You deposited: $" + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Withdraw money if the balance is sufficient
    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("You withdrew: $" + amount);
            return true;
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            System.out.println("Amount must be positive.");
        }
        return false;
    }
}

// ATM interface for users
class ATM {
    private BankAccount account;

    // Link the ATM with the user's account
    public ATM(BankAccount account) {
        this.account = account;
    }

    // Display menu and handle user actions
    public void start() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n1. Withdraw\n2. Deposit\n3. Check Balance\n4. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to withdraw: ");
                    account.withdraw(scanner.nextDouble());
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ");
                    account.deposit(scanner.nextDouble());
                    break;
                case 3:
                    System.out.println("Your balance is: $" + account.getBalance());
                    break;
                case 4:
                    System.out.println("Thank you! Goodbye.");
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        } while (choice != 4);

        scanner.close();
    }
}

// Main class to run the program, with the public class name "atm_interface"
public class atm_interface {
    public static void main(String[] args) {
        BankAccount userAccount = new BankAccount(1000.00);
        ATM atm = new ATM(userAccount);
        atm.start();
    }
}
