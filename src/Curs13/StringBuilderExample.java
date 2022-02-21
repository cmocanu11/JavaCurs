package Curs13;

public class StringBuilderExample {

    public static void main(String[] args) {
        reverseString("alexandra");
        deleteFromString("alexandra");
        replaceFromString();
        insertIntoString("Alexandra",0,"Buna ");
        addSpaces("thisIsACamelCaseText");

    }

    //reverse a string
    public static void reverseString(String text){
        StringBuilder sb = new StringBuilder(text);
        sb.reverse();
        System.out.println(sb);
    }

    //delete from string
    public static void deleteFromString(String text){
        StringBuilder sb = new StringBuilder(text);
        sb.delete(3,5);
        System.out.println(sb);
    }

    //replace

    public static void replaceFromString(){
        StringBuilder sb = new StringBuilder("Salut Bogdan");
        sb.replace(6,sb.length(),"Dragos");
        System.out.println(sb);
    }

    public static void insertIntoString(String text, int index, String textToInsert) {
        StringBuilder sb = new StringBuilder(text);
        System.out.println(sb);
        sb.insert(index, textToInsert);
        System.out.println(sb);
    }

    //ThisIsAnUpperCamelCaseString
    //thisIsALowerCamelCaseString
    public static void addSpaces(String camelCase){
        StringBuilder sb = new StringBuilder(camelCase);
        for(int i = 0 ; i<sb.length();i++){
            if (i!=0 && Character.isUpperCase(sb.charAt(i))){
                sb.insert(i," ");
                i++;
            }
        }
        System.out.println(sb);
    }

}
