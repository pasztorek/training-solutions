package algorithmssum;

import java.util.List;

public class SalesAmountSumCalculator {

public int sumSalesAmount(List<Salesperson> salespersons) {
    int sum = 0;
    for (Salesperson agent : salespersons) {
        sum = sum + agent.getAmount();
    }
        return sum;
    }
}

