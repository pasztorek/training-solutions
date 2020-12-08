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
    private double balance;

    public CreditCard(long balance, Currency currency){
            this.balance=balance;
            this.currency=currency;
    }

    public CreditCard(long balance){
        if(currency==null){
            this.currency=Currency.HUF;
        }

            this.balance=balance;
    }

    public double getBalance() {
        for(Rate rate: ACTUAL_RATES)
            if(currency.toString().equals(rate.getCurrency().toString())){
                balance = balance * rate.getConversionFactor();
            }
        return balance;
    }


    public boolean payment(long amount, Currency currency){
        double convertedAmount=0.0;

        for(Rate rate: ACTUAL_RATES)
            if(currency.toString().equals(rate.getCurrency().toString())){
                 convertedAmount = amount * rate.getConversionFactor();
            }

        if(balance>=convertedAmount){
            balance=balance-convertedAmount;
                    return true;
        }
        return false;
    }

    public boolean payment(long amount){
        if(balance>=amount){
            balance = balance-amount;
            return true;
        }
        return false;
    }
}
