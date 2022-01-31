package Curs6;

import java.util.Random;

public class ArrayExampleProgram {

    public final int LENGTH = 6;
    public final int MAX_NUMBERS = 9;

    public static void main(String[] args) {
        /*Facem un program care genereaza nr random si le tine intr-un array
        * dupa printam array-ul
        * search in array
        * */
        ArrayExampleProgram arrayExampleProgram = new ArrayExampleProgram();
        arrayExampleProgram.printNumbers(arrayExampleProgram.generateNumbers());
        System.out.println("\n"+ arrayExampleProgram.searchInArray(arrayExampleProgram.generateNumbers(),5));

    }

    public int[] generateNumbers() {
        int[] numbers = new int[LENGTH];
        Random random = new Random();
        int randomNr = 0;

        for (int i = 0; i < LENGTH ; i++) {

            do{
                randomNr = random.nextInt(MAX_NUMBERS);
            }while(searchInArray(numbers,randomNr));
            numbers[i] = randomNr;

        }

        return numbers;
    }

    public void printNumbers(int[] arr){
        for (int nr: arr) {
            System.out.print(nr + " | ");
        }
    }

    public boolean searchInArray(int[] arr, int nrToSearchFor){

        for (int nr : arr) {
            if (nr == nrToSearchFor){
                return true;
            }
        }
        return false;
    }


}
