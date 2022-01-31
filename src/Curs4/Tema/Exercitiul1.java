package Curs4.Tema;

import java.util.Scanner;

public class Exercitiul1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int suma = 0;

        for (int i=1; i<=10;i++){
            System.out.print("Please enter number "+ i +" ");
            suma += scan.nextInt();
        }
        System.out.println("The sum of the numbers is " + suma);
    }


}
