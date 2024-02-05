public class BasicAccount implements IAccount {

    private double balance = 0;
    private int accNumber;
    private double limit;

    public BasicAccount (int accountNumber,double withdrawLimit) {
        accNumber = accountNumber;
        limit = withdrawLimit;
    }

    public void Deposit(double amount) {
        balance += amount;
    }

    public double Withdraw(double amount) {
        if (amount > limit) {
            balance -= limit;
            return limit;
        } else {
            balance -= amount;
            return amount;
        }
    }

    public double GetCurrentBalance() {
        return balance;
    }

    public int GetAccountNumber() {
        return accNumber;
    }
}
