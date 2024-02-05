public class StandardAccount implements IAccount {

    private double balance = 0;
    private int accNumber;
    private double limit;

    public StandardAccount(int accountNumber, double creditLimit) {
        accNumber = accountNumber;
        if (creditLimit > 0) {
            creditLimit = 0;
        }
        limit = creditLimit;
    }

    public void Deposit(double amount) {
        balance += amount;
    }

    public double Withdraw(double amount) {
        double maxBalance = balance - limit;
        if (amount > maxBalance) {
            balance -= maxBalance;
            return maxBalance;
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
