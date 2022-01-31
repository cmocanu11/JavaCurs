package Curs6;

public class ArrayExample {
    public static void main(String[] args) {

        String[] textArray =  new String[5];

        textArray[0] = "This";
        textArray[1] = "is";
        textArray[2] = "an";
        textArray[3] = "array";
        textArray[4] = "!";

        try {
            System.out.println(textArray[6]);
        } catch (ArrayIndexOutOfBoundsException err){
            System.out.println("Eroare");
        }
//        for (int i = 0 ; i < textArray.length; i++){
//            if (i == 4){
//                System.out.println(textArray[i]);
//                break;
//            }
//            System.out.print(textArray[i]+" ");
//        }

        for (String test:textArray) {
            System.out.print(test + " ");
        }
    }
}
