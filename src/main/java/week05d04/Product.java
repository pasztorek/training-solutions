package week05d04;

import java.time.LocalDate;

public class Product {

    String product;
    private int year;
    private int month;
    private int day;
    private LocalDate exp;

    public Product(String product, int year, int month, int day) {
        this.product = product;
        this.year = year;
        this.month = month;
        this.day = day;

        exp = LocalDate.of(year,month,day);
    }

    public String getProduct() {
        return product;
    }

    public LocalDate getExp() {
        return exp;
    }

}
