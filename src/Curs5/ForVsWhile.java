package Curs5;

import java.util.Scanner;

public class ForVsWhile {
    public static void main(String[] args) {
        /**
         * Facem un program care ii cere userului numere pe care le aduna
         * Userul introduce cate numere doreste el (fara limita)
         * Cand vrea sa iasa din program utilizatorul va introduce 0
         */
//        rezolvareCuWhile();
        rezolvareCuFor();
    }

    //rezolvare cu while
    public static void rezolvareCuWhile(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int x = scan.nextInt();
        int sum = 0;

        while (x != 0 ){
            sum+=x;
            System.out.println("Please enter another number: ");
            x = scan.nextInt();
        }
        System.out.println("Suma este " + sum);
    }


    //rezolvare cu for
    public static void rezolvareCuFor(){
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        System.out.println("Please enter a number: ");
        for (int x = scan.nextInt(); x != 0; x = scan.nextInt()){
            sum+=x;
            System.out.println("Please enter another number: ");

        }
        System.out.println("Suma este " + sum);
    }

}
