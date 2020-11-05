package finalmodifier;

public class TaxCalculator {

    private final double tax =27;

    public static void main(String[] args) {
        TaxCalculator brutto = new TaxCalculator();
        System.out.println(brutto.tax(763));
        System.out.println(brutto.priceWithTax(763));


    }

    public double tax(double price){

        return tax/100 * price;
    }

    public double priceWithTax(double price){

        return tax(price)+price;
    }
}
