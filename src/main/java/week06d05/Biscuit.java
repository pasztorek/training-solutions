package week06d05;

public class Biscuit {

    private BiscuitType bt;
    private int gramAmount;

    public static Biscuit of(BiscuitType bt, int gram) {
        Biscuit newBiscuit = new Biscuit(bt, gram);
        return newBiscuit;
    }

    public Biscuit(BiscuitType bt, int gramAmount) {
        this.bt = bt;
        this.gramAmount = gramAmount;
    }



    @Override
    public String toString() {
        return bt.name() + " " + gramAmount + " gram";
    }

}