package Curs6.Tema;

import java.util.Scanner;

public class Exercitiul1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] numbers = new int[10];
        int sum = 0;

        for (int i = 0 ; i< numbers.length; i++){
            System.out.println("Introdu numarul de pe pozitia "+ i);
            numbers[i] = scan.nextInt();
        }

        for (int number:numbers) {
            sum+=number;
        }
        System.out.println("Suma finala este: " + sum);
    }
}
