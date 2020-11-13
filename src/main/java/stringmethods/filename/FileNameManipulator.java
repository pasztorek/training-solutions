package stringmethods.filename;

public class FileNameManipulator {

    public char findLastCharacter(String str) {
        if (isEmpty(str)) {
            throw new IllegalArgumentException("Empty string!");
        }

        str = str.trim();
        return str.charAt(str.length() - 1);
    }

    public String findFileExtension(String fileName) {
      //  String str = fileName.trim();

        if (isEmpty(fileName)) {
            throw new IllegalArgumentException("Invalid file name!");
        }

        if (fileName.substring(0, 1).equals(".")) {
            throw new IllegalArgumentException("Invalid file name!");
        }
        return fileName.substring((fileName.length() - 4), fileName.length());
    }



    public boolean identifyFilesByExtension( String ext, String fileName){

        if(isEmpty(fileName)){
            throw new IllegalArgumentException("Invalid argument!");
        }
        if(fileName.substring(0,1).equals(".")) {
            throw new IllegalArgumentException("Invalid argument!");
        }

        if(isEmpty(ext)){
            throw new IllegalArgumentException("Invalid argument!");
        }
        if(ext.substring(0,1).equals(".")) {
            throw new IllegalArgumentException("Invalid argument!");
        }

          return  fileName.substring(fileName.length()-2,fileName.length()).equals(ext);

    }

    public boolean compareFilesByName(String searchedFileName, String actualFileName){
        if(isEmpty(searchedFileName)){
            throw new IllegalArgumentException("Invalid argument!");
        }
        if(searchedFileName.substring(0,1).equals(".")) {
            throw new IllegalArgumentException("Invalid argument!");
        }

        if(isEmpty(actualFileName)){
            throw new IllegalArgumentException("Invalid argument!");
        }
        if(actualFileName.substring(0,1).equals(".")) {
            throw new IllegalArgumentException("Invalid argument!");
        }

        return searchedFileName.toLowerCase().equals(actualFileName.toLowerCase());
    }
    public String changeExtensionToLowerCase(String fileName){
        String str = fileName.trim();
        if(isEmpty(str)){
            throw new IllegalArgumentException("Empty string!");
        }
        if(str.substring(0,1).equals(".")){
            throw new IllegalArgumentException("Invalid argument!");
        }

        return fileName.substring(0,fileName.indexOf('.')) +
                fileName.substring(fileName.indexOf('.')).toLowerCase();
    }

    public String replaceStringPart(String fileName, String present, String target){
        if(isEmpty(fileName)) {
            throw new IllegalArgumentException("Empty string!");
        }
        if(fileName.substring(0,1).equals(".")){
            throw new IllegalArgumentException("Invalid argument!");
        }


        return fileName.replace(present,target);
    }


    private boolean isEmpty(String str) {

        return str == null || "".equals(str.trim());
    }

}

