package Curs5.Tema;

import java.util.Scanner;

public class Exercitiul1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String userCautat = "TestUser";
        String parolaCautata = "1234";
        int retries = 3;
        boolean loginSuccessful = false;
        do {
            System.out.println("Enter a user: ");
            String userIntrodus = scan.nextLine();
            System.out.println("Enter a password: ");
            String parolaIntrodusa = scan.nextLine();

            if (userIntrodus.equals(userCautat) && parolaIntrodusa.equals(parolaCautata)){
                loginSuccessful = true;
                System.out.println("Login successful");
            } else{
                System.out.println("Login error");
                retries--;
            }

            if(retries == 0){
                System.out.println("Maximum attempts reached. User blocked");
            }

        } while(retries != 0 && loginSuccessful == false);
    }
}
