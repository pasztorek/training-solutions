package array;

public class ArrayHandler {

    public static void main(String[] args) {

        ArrayHandler peldany = new ArrayHandler();
        int tomb[] = {1, 2, 3, 4, 5, 6};

        System.out.println(peldany.contains(tomb, 9));
        System.out.println(peldany.find(tomb, 9));


    }


    public boolean contains(int[] source, int itemToFind) {

        for (int i = 0; i < source.length; i++) {
            if (source[i] == itemToFind) {
                return true;
            }

        }

        return false;
    }

    public int find(int[] source, int itemToFind) {
        for (int i = 0; i < source.length; i++) {
            if (source[i] == itemToFind) {
                return i;
            }


        }
        return -1;
    }
}
