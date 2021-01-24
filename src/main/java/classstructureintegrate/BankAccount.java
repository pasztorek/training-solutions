package classstructureintegrate;

public class BankAccount {

    private String owner;
    private String accountNumber;
    private int balance;

    public BankAccount(String owner, String accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.balance = balance;
    }

    public void deposit (int amount){
        this.balance = balance + amount;

    }

    public void withdraw (int amount){
        this.balance = balance - amount;

    }

    public void transfer (BankAccount to, int amount) {
       to.deposit(amount);
       withdraw(amount);


    }

    public String getInfo (){

        return owner + " (" + accountNumber + ") : " + balance + " Ft";

    }
}
