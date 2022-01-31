package Curs5;

public class SimpleWhileLoop {
    public static void main(String[] args) {
        //while loop example
        int i = 0;
        while (i < 10){
            System.out.println(i);
            i++;
        }

        int j = 0;
        String[] array = {"one","two","three","four"};
        while (j< array.length){
            System.out.println(array[j]);
            j++;
        }
    }
}
