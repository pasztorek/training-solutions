package week14d04;

import java.util.List;

public class ContractCreator {

   private Contract contract;

    public ContractCreator(String client, List<Integer> monthlyPrices) {
        this.contract = new Contract(client, monthlyPrices);
    }
}
