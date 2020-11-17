package algorithmscount.bankaccounts;

import java.util.List;

public class BankAccountConditionCounter{

    public int countWithBalanceGreaterThan(List<BankAccount> account, int limit){
        int sum=0;
        for (BankAccount acc: account){
            if(acc.getBalance()>limit){
                sum++;
            }
        }
                return sum;
    }
}