package classstructureintegrate;

public class Product {

    private String product;
    private int price;


    public Product(String product, int price) {
        this.product = product;
        this.price = price;
    }

    public String getProduct() {
        return product;
    }

    public int getPrice() {
        return price;
    }

    public void increasePrice(int emel){
        this.price = price + emel;

    }

    public void decreasePrice(int csokkent){
        this.price = price - csokkent;

    }
}
