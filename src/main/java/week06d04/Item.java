package week06d04;

public class Item {

    int price;
    int month;
    String name;

    public int getPrice() {
        return price;
    }

    public int getMonth() {
        return month;
    }

    public String getName() {
        return name;
    }

    public Item(int price, int month, String name) {
        this.price = price;
        this.month = month;
        this.name = name;
    }

    @Override
    public String toString() {

        return name + "/" + month;
    }
}
