package Curs3;

import java.util.Scanner;

public class GreatestOfThreeNumbers {

    int number1;
    int number2;
    int number3;

    //metoda care intreaba utilizatorul pentru 3 numere
    public void askTheUserForThreeNumbers(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the first number: ");
        number1 = scan.nextInt();
        System.out.println("Please enter the second number: ");
        number2 = scan.nextInt();
        System.out.println("Please enter the third number: ");
        number3 = scan.nextInt();
    }

    //metoda care compara cele trei numere si decide care este cel mai mare
    public void compareThreeNumbers(){

        if (number1 > number2 && number1 > number3){

            System.out.println("Numarul 1 este cel mai mare");

        }else if(number2 > number1 && number2 > number3) {

            System.out.println("Numarul 2 este cel mai mare");

        } else if(number3 > number1 && number3 > number2){
            System.out.println("Numarul 3 este cel mai mare");
        }else{
            System.out.println("Some of the numbers are equal!");
        }
    }
}
