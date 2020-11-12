package introexception;

public class SsnValidator {



        public boolean isValidSsn(String ssn){
        int paratlanosszeg=0;
        int parososszeg=0;

        for (int i=0; i<8 ;i=i+2) {
            int paratlan = Integer.parseInt(ssn.substring(i, i + 1)) * 3;
            paratlanosszeg = paratlanosszeg + paratlan;
        }
            for (int j=1; j < 8; j=j+2) {
                int paros = Integer.parseInt(ssn.substring(j, j + 1)) * 7;
                parososszeg = parososszeg + paros;
            }


         if((paratlanosszeg+parososszeg) %10 != Integer.parseInt(ssn.substring(8, 9))) {
             return false;
         }
            else {
                return true;
            }
        }

    }