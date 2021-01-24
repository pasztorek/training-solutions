package ioreaderclasspath;

public class Country {

    private String name;
    private int BorderCountries;

    public Country(String name, int borderCountries) {
        this.name = name;
        BorderCountries = borderCountries;
    }

    public String getName() {
        return name;
    }

    public int getBorderCountries() {
        return BorderCountries;
    }
}
