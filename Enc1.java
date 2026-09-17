
class BankAccount {

    private double balance;

    void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Invalid balance");
        }
    }

    double getBalance() {
        return balance;
    }
}

public class Enc1 {
    public static void main(String[] args) {

        BankAccount b = new BankAccount();

        b.setBalance(5000);

        System.out.println("Balance: " + b.getBalance());
    }
}
