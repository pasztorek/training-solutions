package covid;

public enum VaccineTypes {

    ASTRA(1),PFIZER(2),SPUTNIK(3),MODERNA(4);

   private int id;

    VaccineTypes(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }


}
