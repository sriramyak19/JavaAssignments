public class BankAccount {
    int accountNumber;
    String accountHolderName;
    double balance;

    BankAccount(int number, String name, double balance) {
        this.accountNumber = number;
        this.accountHolderName = name;
        this.balance = balance;
    }

    void deposit(double amount) {
        double newBalance = balance + amount;
        balance = newBalance;
        System.out.println("New Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount ba = new BankAccount(101, "David", 1000);
        ba.deposit(500);
    }
}

