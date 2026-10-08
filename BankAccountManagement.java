import java.util.Scanner;

class BankAccount {

    String accountNumber;
    String accountHolderName;
    double balance;

  
    BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Amount deposited successfully.");
    }


    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Amount withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance.");
        }

    double checkBalance() {
        return balance;
    }

    void displayAccount() {
        System.out.println("\n--- Account Details ---");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }
}

public class BankAccountManagement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account Number: ");
        String number = sc.nextLine();

        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Initial Balance: ");
        double amount = sc.nextDouble();

        BankAccount account = new BankAccount(number, name, amount);

        System.out.print("Enter Deposit Amount: ");
        double deposit = sc.nextDouble();
        account.deposit(deposit);

        System.out.print("Enter Withdrawal Amount: ");
        double withdraw = sc.nextDouble();
        account.withdraw(withdraw);

        System.out.println("\nCurrent Balance: " + account.checkBalance());

        account.displayAccount();

        sc.close();
    }
}
    
