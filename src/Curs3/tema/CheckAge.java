package Curs3.tema;

import java.util.Scanner;

public class CheckAge {
    int age;

    public void checkTheAge(){
        if (age < 0){
            System.out.println("You entered an invalid age!");
        }else if (age < 18) {
            System.out.println("Esti minor!");
        }else if (age <= 65) {
            System.out.println("Esti adult!");
        } else {
            System.out.println("Esti batran!");
        }

    }

    public void askTheUserForTheAge(){
        System.out.println("Please enter your age: ");
        Scanner scan = new Scanner(System.in);
        age = scan.nextInt();
    }
}
