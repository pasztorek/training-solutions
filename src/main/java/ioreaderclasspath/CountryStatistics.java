package ioreaderclasspath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class CountryStatistics {

    private List<Country> CountryList = new ArrayList<>();


    public List<Country> getCountryList() {
        return new ArrayList<>(CountryList);
    }


    public void readFromFile(String file){

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(CountryStatistics.class.getResourceAsStream("/"+file)))){
            String line;

            while ((line = reader.readLine()) != null){
                String name;
                int bordered;

                name = line.substring(0,line.indexOf(' '));
                bordered = Integer.parseInt(line.substring(line.length()-1));

                CountryList.add(new Country(name, bordered));
            }
        }
        catch (IOException ioe){
            throw new IllegalStateException("Cannot read the file", ioe);
        }
    }


    public int numberOFCountries(){
        return CountryList.size();
    }


    public Country mostBorderCountries(){

        Country most= CountryList.get(0);

        for(Country co: CountryList){
            if(co.getBorderCountries() > most.getBorderCountries()){
                most = co;
            }
        }
        return most;
    }

}
