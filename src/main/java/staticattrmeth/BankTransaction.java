package staticattrmeth;

import java.math.BigDecimal;

public class BankTransaction {


    private static long currentMinValue;
    private static long currentMaxValue;
    private static long counter;
    private static BigDecimal sum;


    private static final long MAX_VALUE =10_000_000;
    private static final long MIN_VALUE =1;

    private long trxValue;


    public static void initTheDay(){
        counter = 0;
        sum = new BigDecimal("0");
        currentMinValue = 0;
        currentMaxValue = 0;

    }

    public static BigDecimal averageOfTransaction(){

       return sum.divide(new BigDecimal(counter));
    }

    public static long getCurrentMinValue(){

        return currentMinValue;
    }

    public static long getCurrentMaxValue(){

        return currentMaxValue;
    }

    public static BigDecimal getSumOfTrxs(){

        return sum;
    }

    public BankTransaction(long trxValue){
        if(trxValue<=MIN_VALUE && trxValue>=MAX_VALUE) {
            throw new IllegalArgumentException("Nem megfelelő összeg!");
        }
            counter++;
            sum=sum.add(new BigDecimal(trxValue));
            this.trxValue=this.trxValue+trxValue;

            if(trxValue<=currentMinValue){
                currentMinValue=trxValue;
            }
            if(trxValue>=currentMaxValue){
            currentMaxValue=trxValue;
        }


        }

    public long getTrxValue()
    {
        return trxValue;
    }
}
