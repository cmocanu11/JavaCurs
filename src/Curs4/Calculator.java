package Curs4;

import java.util.Scanner;

public class Calculator {
    /**
     * Calculator simplu pentru operatiile de baza +, -, *, / cu 2 numere
     * Intrebam utilizatorul numarul 1
     * Intrebam utilizatorul operatia
     * Intrebam utilizatorul numarul 2
     * Afisam operatia si rezultatul
     *
     * Ex: 2+3=5
     */

    int num1;
    int num2;
    int result;
    char operation;

    //intreba utilizatorul valorile
    public void askTheUser(){
        System.out.println("Enter the first number: ");
        Scanner scan = new Scanner(System.in);
        num1 = scan.nextInt();

        System.out.println("Enter the desired operation: ");
        operation = scan.next().charAt(0);

        System.out.println("Enter the second number: ");
        num2 = scan.nextInt();
    }

    //calculam pe baza valorilor
    public void calculateValues(){
        if (operation == '+'){
            result = num1 + num2;
            printResult();
        }else if (operation == '-'){
            result = num1 - num2;
            printResult();
        }else if (operation == '*' || operation == 'x'){
            result = num1 * num2;
            printResult();
        }else if(operation == '/'){
            result = num1 / num2;
            printResult();
        }else{
            System.out.println("Wrong character! Please enter either : '+', '-' , '*', '/'");
        }
    }
    public void printResult (){
        System.out.println(num1 + " " + operation + " " + num2 + " = " + result );
    }
}
