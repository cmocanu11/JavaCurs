package Curs9;

import java.util.Scanner;

public class TestAgeVerifier {
    public static void main(String[] args) {

        AgeVerifier ageVerifier = new AgeVerifier();
        Scanner scan = new Scanner(System.in);
        System.out.println("Introdu o varsta:");
        int age = scan.nextInt();
        try {
            ageVerifier.checkAgeLimit(age);
        } catch (MyCustomException e){
            System.out.println("You must be 18 to vote!");
            e.printStackTrace();
        }

    }
}
