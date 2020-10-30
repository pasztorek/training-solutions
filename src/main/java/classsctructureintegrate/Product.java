package classsctructureintegrate;

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

    public void setProduct(String product) {
        this.product = product;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void increasePrice(int emel){
        this.price = price + emel;

    }

    public void decreasePrice(int csokkent){
        this.price = price - csokkent;

    }
}
