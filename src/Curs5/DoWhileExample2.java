package Curs5;

import java.util.Scanner;

public class DoWhileExample2 {

    /**
     * Introducem numere si le inmultim cu 10
     * printam rezultatul
     * Cand introducem 0, oprim executia
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x;
        do {
            System.out.println("Introdu un numar: ");
            x = scan.nextInt();
            System.out.println(x * 10);

        } while (x != 0);
    }
}
