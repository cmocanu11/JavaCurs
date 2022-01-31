package Curs4;

import java.util.Scanner;

public class ConditionalOperatorExample {

    /**
     *
     * Program care citeste doua numere de la tastatura
     * Verifica daca fiecare numar este pozitiv
     * Verifica daca ambele numere sunt pozitive
     * Verificam care este cel mai mic numar dintre cele 2
     *
     */


    public static void main(String[] args) {
        int num1;
        int num2;
        //Intrebam cele 2 numere
        Scanner scan = new Scanner(System.in);
        System.out.println("Introdu primul numar: ");
        num1 = scan.nextInt();
        System.out.println("Introdu al doilea numar: ");
        num2 = scan.nextInt();

        //Verificam daca num1 este pozitiv
        if(num1 > 0 ){
            System.out.println("Num1 este pozitiv");
        } else {
            System.out.println("Num1 este negativ");
        }

        //resp = num1 > 0?"Num1 este pozitiv" : "Num1 este negativ";

        //verificam daca num2 este pozitiv
        if(num2 > 0 ){
            System.out.println("Num2 este pozitiv");
        } else {
            System.out.println("Num2 este negativ");
        }
        //resp = num2 > 0?"Num2 este pozitiv" : "Num2 este negativ";

        //verificam daca ambele numere sunt pozitive
        if (num1 > 0 && num2 > 0){
            System.out.println("Numerele sunt pozitive");
        } else {
            System.out.println("Unul dintre numere este negativ");
        }
        //resp = (num1>0) && (num2>0) ? "Numerele sunt pozitive" : "Unul dintre numere este negativ";

        //verificam cel mai mic numar
        if(num1 < num2){
            System.out.println("Num1 este cel mai mic");
        } else if (num1 == num2){
            System.out.println("Sunt egale");
        } else {
            System.out.println("Num2 este cel mai mic");
        }


        //ternary operator
        System.out.println();
        String resp;
        resp = num1 > 0?"Num1 este pozitiv":"Num1 este negativ";
        System.out.println(resp);

        resp = num2 > 0?"Num2 este pozitiv" : "Num2 este negativ";
        System.out.println(resp);

        resp = (num1>0) && (num2>0) ? "Numerele sunt pozitive" : "Unul dintre numere este negativ";
        System.out.println(resp);

        resp = num1 == num2 ? "Sunt egale" : num1 < num2? "Num1 este cel mai mic" : "Num2 este cel mai mic";
        System.out.println(resp);
    }
}
