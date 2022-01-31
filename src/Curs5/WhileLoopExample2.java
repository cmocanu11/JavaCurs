package Curs5;

import java.util.Scanner;

public class WhileLoopExample2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        int number = scanner.nextInt();

        //for
        for (int i = 1; i<=10; i++){
            System.out.println(number + "*" + i + "=" + number*i);
        }
        System.out.println("\nWHILE");
        //while
        int x = 1;
        while (x <= 10){
            System.out.println(number + "*" + x + "=" + number*x);
            x++;
        }
    }
}
