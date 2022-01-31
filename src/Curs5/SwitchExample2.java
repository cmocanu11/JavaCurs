package Curs5;

import java.util.Scanner;

public class SwitchExample2 {
    public static void afisare(int num1, int num2, char operation, int result){
        System.out.println(num1 + " " + operation + " " + num2 + " = " + result);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introdu primul numar: ");
        int num1 = scan.nextInt();

        System.out.println("Introdu operatia dorita: ");
        char operation = scan.next().charAt(0);

        System.out.println("Introdu al doilea numar: ");
        int num2 = scan.nextInt();

        int result = 0;

        switch (operation){
            case '+' : {
                result= num1 + num2;
                afisare(num1,num2,operation,result);

                break;
            }
            case '-' : {
                result= num1 - num2;
                afisare(num1,num2,operation,result);

                break;
            }
            case '*' : {
                result= num1 * num2;
                afisare(num1,num2,operation,result);

                break;
            }
            case '/' : {
                result= num1 / num2;
                afisare(num1,num2,operation,result);

                break;
            }
            default:
                System.out.println("Invalid operation!");
        }
    }
}
