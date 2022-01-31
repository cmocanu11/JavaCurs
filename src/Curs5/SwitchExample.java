package Curs5;

import java.util.Locale;
import java.util.Scanner;

public class SwitchExample {
    /**
     * Intrebam ce calificativ a primit utilizatorul
     * Pe baza notei intoarcem un mesaj
     * nota A : Felicitari!
     * nota B : Destul de bine!
     * nota C : Suficient!
     * nota D : Insuficient!
     * daca introduce alta nota, printam te rog introdu o nota valida
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introdu nota primita: ");
        String nota = scan.next();
        switch (nota.toUpperCase()){
            case "A": {
                System.out.println("Felicitari!");
                break;
            }
            case "B": {
                System.out.println("Destul de bine!");
                break;
            }
            case "C": {
                System.out.println("Suficient!");
                break;
            }
            case "D": {
                System.out.println("Insuficient!");
                break;
            }
            default:{
                System.out.println("Introdu o nota valida ");
            }
        }
    }
}
