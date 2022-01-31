package Curs9;

public class TryCatchFinally {
    public static void main(String[] args) {

        try {
            String name = null;
//            String name = "name";
            System.out.println(name.length());
        }catch (NullPointerException e){
            System.out.println("Null Pointer exception occured");

        }finally {
            System.out.println("Finally block of code!");
        }

    }
}
