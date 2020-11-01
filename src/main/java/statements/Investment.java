package statements;

public class Investment {

    private double cost = 0.3;
    private int InterestRate;
    private int fund;
    private boolean active = true;

    public Investment(int interestRate, int fund) {
        InterestRate = interestRate;
        this.fund = fund;
    }

    public int getFund(){
        return fund;
        }

    public double getYield(int days){
        return (days/365) * (InterestRate*fund)/100;
        }

    public double close(int days){
        double vegszamla = active == true ? getYield(days) + getFund() : 0.0;
        this.active = false;
        return vegszamla;
        }
    }

