package algorithmscount.bankaccounts;

import static algorithmscount.bankaccounts.TransactionType.CREDIT;
import static algorithmscount.bankaccounts.TransactionType.DEBIT;

public class Transaction {

    private String accountNumber;
    private TransactionType type;
    int amount;

    public Transaction(String accountNumber, TransactionType type, int amount) {
        this.accountNumber = accountNumber;
        this.type = type;
        this.amount = amount;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public TransactionType getType() {
        return type;
    }

    public int getAmount() {
        return amount;
    }

    public boolean isDebit() {
        if (this.type.equals(DEBIT)) {

            return true;
        }
            return false;
    }

    public boolean isCredit() {
        if (this.type.equals(CREDIT)) {

            return true;
        }
        return false;
    }
}