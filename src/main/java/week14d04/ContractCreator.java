package week14d04;

import java.util.List;

public class ContractCreator {

   private Contract contract;

    public ContractCreator(String client, List<Integer> monthlyPrices) {
        this.contract = new Contract(client, monthlyPrices);
    }

    public Contract create(String name){

    return new Contract(name, this.contract.getMonthlyPrices());
    }

    public static void main(String[] args) {
        ContractCreator cc = new ContractCreator("Panni", List.of(1,2,3,4,5));
    }
}
