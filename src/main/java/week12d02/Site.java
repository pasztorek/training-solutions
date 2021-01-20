package week12d02;

public class Site {

    int side;
    int lenght;
    Fence fence;

    public Site(int side, int lenght, Fence fence) {
        this.side = side;
        this.lenght = lenght;
        this.fence = fence;
    }

    public int isSide() {
        return side;
    }

    public int getLenght() {
        return lenght;
    }

    public Fence getFence() {
        return fence;
    }
}
