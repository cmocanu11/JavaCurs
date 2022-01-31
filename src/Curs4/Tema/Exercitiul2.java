package Curs4.Tema;

import java.util.Scanner;

public class Exercitiul2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nrCitit;

        System.out.print("Please enter a number ");
        nrCitit = scan.nextInt();

        for (int i = 1; i <= 10; i++){
            System.out.println(nrCitit + " * " + i + " = " + nrCitit*i);
        }

    }
}
