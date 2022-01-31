package Curs5;

public class DoWhileExample {
    public static void main(String[] args) {
        String[] array = {"one", "two", "three", "four"};

        int i = 0;

        do {
            System.out.println(array[i]);
            i++;
        } while (i < array.length );
    }
}
