package algorithmsdecision;

import java.util.List;

import static algorithmsdecision.TransactionOperation.CREDIT;

public class TransactionExecutor {

    private List <BankAccount> bankAccounts;
    private List <Transaction> transactions;

    public void executeTransactions(List<Transaction> transactions, List<BankAccount> bankAccounts){


            for(int i =0; i<transactions.size(); i++) {
                BankAccount transfer = new BankAccount(bankAccounts.get(i).getNameOfOwner(), bankAccounts.get(i).getAccountNumber(), bankAccounts.get(i).getBalance());
                if (transactions.get(i).getTransactionOperation().equals(CREDIT)) {
                    bankAccounts.get(i).deposit(transactions.get(i).getAmount());
                } else {
                    bankAccounts.get(1).withdraw(transactions.get(i).getAmount());
                }
            }
    }

}
