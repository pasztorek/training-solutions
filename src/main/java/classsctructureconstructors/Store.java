package classsctructureconstructors;

public class Store {

    private String product;
    private int stock = 0;

    public Store(String product) {
        this.product = product;
    }

    public void store(int plusz){
        stock = plusz + stock;

    }
    public void dispatch(int minusz){
        stock = stock - minusz;

    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
