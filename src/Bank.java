import java.util.ArrayList;
import java.util.List;

public class Bank implements IBank {

    List<IAccount> bankList = new ArrayList<>();

    public Bank() {

    }
    public void OpenAccount(IAccount account) {
        bankList.add(account);
    }

    public void CloseAccount(int accountNumber) {
        List<IAccount> listOfAccounts = List.copyOf(bankList);
        for (IAccount account : listOfAccounts) {
            if (accountNumber == account.GetAccountNumber()) {
                if (account.GetCurrentBalance() >= 0) {
                    bankList.remove(account);
                } else {
                    System.out.println("Account is not closed due to debt");
                }
            }
        }
    }

    public List<IAccount> GetAllAccounts() {
        return bankList;
    }

    public List<IAccount> GetAllAccountsInDebt() {
        List<IAccount> debtList = new ArrayList<>();
        for (IAccount account : bankList) {
            if (account.GetCurrentBalance() < 0) {
                debtList.add(account);
            }
        }
        return debtList;
    }

    public List<IAccount> GetAllAccountsWithBalance(double balanceAbove) {
        List<IAccount> balanceList = new ArrayList<>();
        for (IAccount account : bankList) {
            if (account.GetCurrentBalance() > balanceAbove) {
                balanceList.add(account);
            }
        }
        return balanceList;
    }


}


