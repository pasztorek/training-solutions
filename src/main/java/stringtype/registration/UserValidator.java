package stringtype.registration;

public class UserValidator {

     public boolean isValidUesrname(String username){

         return username.length()>=8;

     }

     public boolean isValidPassword(String pwd){

         return pwd.length()>=8;

     }

     public boolean isValidEmail(String email){

         int kukacind;
         int pontind;

         kukacind = email.indexOf("@");
         pontind = email.indexOf(".");

         return kukacind>0 && email.length() -1 > pontind;
     }
}
