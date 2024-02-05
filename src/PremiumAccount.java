public class PremiumAccount implements IAccount {

    private double balance = 0;
    private int accNumber;


    public PremiumAccount(int accountNumber) {
        accNumber = accountNumber;
    }

    public void Deposit(double amount) {
        balance += amount;
    }

    public double Withdraw(double amount) {
        balance -= amount;
        return amount;
    }

    public double GetCurrentBalance() {
        return balance;
    }

    public int GetAccountNumber() {
        return accNumber;
    }
}
