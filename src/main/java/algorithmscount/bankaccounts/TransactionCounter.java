package algorithmscount.bankaccounts;


import java.util.ArrayList;
import java.util.List;

public class TransactionCounter {

    private List<Transaction> tansfers = new ArrayList<>();


    public int countEntryLessThan(List<Transaction>trans , int limit){
        int sum=0;
        for(Transaction trans1: trans){
            if(trans1.amount<limit){
                sum++;
            }
        }

        return sum;
    }



}
