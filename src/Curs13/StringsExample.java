package Curs13;

public class StringsExample {

    public static void main(String[] args) {
        transformToString();
    }

    public static void transformToString(){

        //char
        char ch = 'a';
        String str = Character.toString(ch);
        System.out.println("String is : " + str);
        String str2 =  String.valueOf(ch);
        System.out.println("String2 is : " + str2);

        //boolean
        boolean bol = true;
        String str3 = Boolean.toString(bol);
        System.out.println("String3 is : " + str3);
        String str4 = String.valueOf(bol);
        System.out.println("String4 is : " + str4);

        String str5 = null;
        System.out.println(String.valueOf(str5)); //"null"
        System.out.println(str5.toString());
    }

}
