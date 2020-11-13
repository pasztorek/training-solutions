package stringmethods.filename;

public class FileNameManipulator {

    public char findLastCharacter(String str){

       // if (isEmpty(str)) {
       //     throw new IllegalArgumentException("Empty string!");
      // }
        str = str.trim();
        return str.charAt(str.length() - 1);

    }

    public String findFileExtension(String fileName){

       return fileName.substring((fileName.length()-4),fileName.length());


    }

    public boolean identifyFilesByExtension( String ext, String fileName){

          return  fileName.substring(fileName.length()-2,fileName.length()).equals(ext);

    }

    public boolean compareFilesByName(String searchedFileName, String actualFileName){

        return searchedFileName.toLowerCase().equals(actualFileName.toLowerCase());
    }
    public String changeExtensionToLowerCase(String fileName){

        return fileName;
    }

    public String replaceStringPart(String fileName, String present, String target){

        return fileName;
    }

    private boolean isEmpty(String str) {

        return str == null || "".equals(str.trim());
    }

}

