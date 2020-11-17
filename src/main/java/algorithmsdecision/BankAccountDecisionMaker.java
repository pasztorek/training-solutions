package algorithmsdecision;

import java.util.ArrayList;
import java.util.List;

public class BankAccountDecisionMaker {

    private List<BankAccount> accounts = new ArrayList<>();

    public boolean containsBalanceGreaterThan(List<BankAccount> inputAccounts, int minAmount){
        for(BankAccount account: inputAccounts){
            if(account.getBalance()>minAmount){
                return true;
            }
        }

        return false;
    }
}
