
public class Main {

    public static void main(String[] args) {
        Bank myBank = new Bank();

        // Assuming IAccount has a constructor or a method to set initial values
        IAccount account1 = new StandardAccount(12345, -100); // Replace 'Account' with the actual implementation of IAccount
        IAccount account2 = new PremiumAccount(67890); // Similarly for this
        IAccount account3 = new BasicAccount(88888, 100); // Similarly for this

        account1.Withdraw(300);
        account2.Withdraw(300);
        account3.Deposit(300);
        // Open accounts
        myBank.OpenAccount(account1);
        myBank.OpenAccount(account2);
        myBank.OpenAccount(account3);

        System.out.println(myBank.GetAllAccountsInDebt());


    }

}
