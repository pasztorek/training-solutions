package initalizer;

import java.util.ArrayList;
import java.util.List;

public class CreditCard {

    private static final List<Rate> ACTUAL_RATES = new ArrayList<>();

    static{

        ACTUAL_RATES.add(new Rate(Currency.HUF, 1.0));
        ACTUAL_RATES.add(new Rate(Currency.EUR, 308.23));
        ACTUAL_RATES.add(new Rate(Currency.SFR, 289.24));
        ACTUAL_RATES.add(new Rate(Currency.GBP, 362.23));
        ACTUAL_RATES.add(new Rate(Currency.USD, 289.77));

    }

    private Currency currency;
    private long balance;

    public CreditCard(long balance, Currency currency){
            this.balance=balance;
            this.currency=currency;
    }

    public CreditCard(long balance){
            this.balance=balance;
    }

    public long getBalance() {
        return balance;
    }


    public boolean payment(long amount, Currency currency){



        return true;
    }

    public boolean payment(long amount){



        return true;
    }
}
