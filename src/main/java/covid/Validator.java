package covid;

import java.time.DateTimeException;
import java.time.LocalDate;

public class Validator {

    public LocalDate validDate(String date){
        LocalDate ld = null;

        try {

            ld = LocalDate.parse(date);
        }

        catch (DateTimeException se) {
            throw new IllegalArgumentException("Nem megfelelő dátum formátum");
        }
        return ld;
    }

    public boolean tajCDVCheck(String taj){

            int sum = 0;

        for (int i=0; i<=7; i++){
            int number=0;
            char chr = taj.charAt(i);
            number = Character.getNumericValue(chr);

            sum = sum + number *3;
            i++;

            chr = taj.charAt(i);
            number = Character.getNumericValue(chr);
            sum = sum + number*7;
        }
        int cdv = sum % 10;
        if(cdv == Character.getNumericValue(taj.charAt(8))){
            return true;
        }

        throw new IllegalArgumentException("Nem érvényes taj szám!");
    }
}
