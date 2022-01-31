package Curs5;

import java.util.Scanner;

public class WhileLoopExample3 {
    /**
     * Facem un program care calculeaza salariul pe saptamana
     * intrebam utilizatorul cate ore a lucrat
     * dupa care calculam atata timp cat numarul de ore nu este mai mare de 40 sau mai mic de 1
     * daca nr de ore nu este valid il rugam sa introduca un numar valid de ore
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //ce stim
            int maxAllowedHoursWorked = 40;
            int ratePerHour = 15;

        //ce nu stim
            System.out.print("Introduceti nr de ore lucrate saptamana asta: ");
            int hoursWorked = scan.nextInt();

        //validarea
            while (hoursWorked > maxAllowedHoursWorked || hoursWorked < 1){
                System.out.println("Numar invalid de ore introdus.");
                System.out.println("Introdu un nr valid de ore care sa fie mai mic de 40 si mai mare ca 1? ");
                hoursWorked = scan.nextInt();
            }
        System.out.println("Suma de plata este: " + hoursWorked * ratePerHour);
    }
}
