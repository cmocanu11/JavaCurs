package Curs4;

import java.util.Scanner;

public class ForExample2 {

    // program care intreaba userul un caracter
    // mai intreaba un numar
    // va lua caracterul si va printa atatea linii si coloane cate sunt date in numar
    // Ex: * 3
    /*
       * * *
       * * *
       * * *
     */

    public static void main(String[] args) {
        char car;
        int num;
        Scanner scan = new Scanner(System.in);
        System.out.println("Introdu caracter");
        car = scan.next().charAt(0);
        System.out.println("Introdu numar");
        num = scan.nextInt();

        //for ptr nr de linii
        for (int i = 0; i<num; i++){
            //for ptr caracter
            for (int j = 0; j<num; j++){
                System.out.print(car + " ");

            }
            System.out.println();
        }

    }
}
