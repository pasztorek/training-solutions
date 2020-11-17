package algorithmsdecision;

import java.time.LocalDateTime;

import static algorithmsdecision.TransactionOperation.CREDIT;
import static algorithmsdecision.TransactionOperation.DEBIT;

public class Transaction {

    private String accountNumber;
    private TransactionOperation transactionOperation;
    private int amount;
    private LocalDateTime dateOfTransaction;
    private TransactionStatus status;

    public Transaction(String accountNumber, TransactionOperation transactionOperation, int amount, LocalDateTime dateOfTransaction) {
        this.accountNumber = accountNumber;
        this.transactionOperation = transactionOperation;
        this.amount = amount;
        this.dateOfTransaction = dateOfTransaction;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public TransactionOperation getTransactionOperation() {
        return transactionOperation;
    }

    public int getAmount() {
        return amount;
    }

    public LocalDateTime getDateOfTransaction() {
        return dateOfTransaction;
    }

    public TransactionStatus getStatus() {
        return status;
    }
    public boolean isCredit(){
        if(this.transactionOperation.equals(CREDIT)){
            return true;
        }
            return false;
    }

    public boolean isDebit(){
        if(this.transactionOperation.equals(DEBIT)){
            return true;
        }
            return false;
    }
}
