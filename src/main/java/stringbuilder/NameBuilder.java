package stringbuilder;

public class NameBuilder {


    private String familyName;
    private String middleName;
    private String givenName;
    private String title;


    public String concatNameWesternStyle(String familyName, String middleName, String givenName, Title title){

        StringBuilder eredmeny = new StringBuilder();

        if(title != null){
            eredmeny.append(title.title);
            eredmeny.append(" ");
        }

        if(isEmpty(familyName) || isEmpty(givenName)){
            throw new IllegalArgumentException("Család és keresztnév kötelező");
        }

        eredmeny.append(givenName);
        eredmeny.append(" ");


        if(!isEmpty(middleName)) {
            eredmeny.append(middleName);
            eredmeny.append(" ");
        }

        eredmeny.append(familyName);


        return eredmeny.toString();


    }
    public String concatNameHungarianStyle(String familyName, String middleName, String givenName, Title title){

        StringBuilder eredmeny = new StringBuilder();

        if(title != null){
            eredmeny.append(title.title);
            eredmeny.append(" ");
        }

        if(isEmpty(familyName) || isEmpty(givenName)){
            throw new IllegalArgumentException("Család és keresztnév kötelező");
        }


        eredmeny.append(familyName);
        eredmeny.append(" ");

        if(!isEmpty(middleName)) {
            eredmeny.append(middleName);
            eredmeny.append(" ");
        }


        eredmeny.append(givenName);

        return eredmeny.toString();

    }
    public String insertTitle(String name, Title title, String where){


        return name;
    }
    public String deleteNamePart(String name, String delete){


        return name;
    }

    public boolean isEmpty(String str) {
        return str == null || "".equals(str.trim());
    }

}
