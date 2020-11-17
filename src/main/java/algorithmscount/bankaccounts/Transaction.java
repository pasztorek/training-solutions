package algorithmscount.bankaccounts;

public class Transaction {

    private String accountNumber;
    private TransactionType type;
    int amount;

    public Transaction(String accountNumber, TransactionType type, int amount) {
        this.accountNumber = accountNumber;
        this.type = type;
        this.amount = amount;
    }


}
