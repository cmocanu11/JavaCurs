package Curs5;

import java.util.Scanner;

public class ForBreakExample {
    public static void main(String[] args) {

        /**
         * Luam un string si sa cautam o litera in acel string.
         * daca gasim litera, iesim din program si printam "Am gasit litera"
         * daca nu o gasim, printam "Nu am gasit litera"
         */

        boolean conditie = false;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a text: ");
        String text = scan.next();

        System.out.println("Litera cautata: ");
        char letter = scan.next().charAt(0);
        char letterUpperCase = Character.toUpperCase(letter);
        char letterLowerCase = Character.toLowerCase(letter);

        //masina
        //012345
        //i==letter --> boolean true
        int counter = 0;
        for (int i = 0 ; i < text.length(); i ++){
            char currentLetter = text.charAt(i);
            System.out.println(i);
            if (currentLetter == letterLowerCase || currentLetter == letterUpperCase){
                conditie = true;
                counter++;
//                break;
            }
        }
        if (conditie){
            System.out.println("Letter found");
            System.out.println("Counter " + counter);
        } else
        {
            System.out.println("Letter not found");
        }




    }
}
