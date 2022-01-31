package Curs5.Tema;

import java.util.Scanner;

public class Exercitiul2 {
    public static void main(String[] args) {
            fibonacciWhile();
            System.out.println();
            fibonacciFor();


    }
    public static void fibonacciWhile(){
        int lungimeSir = 9;
        int number1 = 0;
        int number2 = 1;
        int number3;
        System.out.println("Fibonnaci cu while:");
        System.out.print(number1 + " " + number2);
        lungimeSir = lungimeSir - 2; // am scazut 2 pentru ca primele 2 sunt afisate;

        while (lungimeSir != 0){
            number3 = number1 + number2;
            System.out.print(" " + number3);
            number1 = number2;
            number2 = number3;
            lungimeSir--;
        }
    }

    public static void fibonacciFor(){
        int lungimeSir = 9;
        int number1 = 0;
        int number2 = 1;
        int number3;
        System.out.println("Fibonnaci cu for:");
        System.out.print(number1 + " " + number2);

        for (int i = 2 ; i < lungimeSir; i++){
            number3 = number1 + number2;
            System.out.print(" " + number3);
            number1 = number2;
            number2 = number3;
        }
    }
}
