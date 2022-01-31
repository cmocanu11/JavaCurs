package Curs6;

import java.util.Random;
import java.util.Scanner;

public class DiceGame {

    /*
    * Facem un joc de zaruri in care avem urmatoarele reguli:
    * daca userul da in total: 2, 6, 12 pierde  //break
    * daca userul da in total: 7, 11 castiga    //break
    * daca userul da in total: 3, 10 repeta     //continue
    * daca nu da oricare dintre valorile de mai sus, intrebam daca vrea sa mai dea inca o data. Raspuns boolean
    */

    public static void main(String[] args) {

        boolean condition = true;

        while (condition){
            int dice1 = (int) (Math.random()*6+1);
            int dice2 = (int) (Math.random()*6+1);
            int sum = dice1 + dice2;

            System.out.println("Ai dat: " + sum);

            if (sum == 2 || sum == 6 || sum ==12 ){
                System.out.println("Ai pierdut!");
                break;
            }else if (sum == 7 || sum == 11){
                System.out.println("Ai castigat!");
                break;
            }else if (sum == 3 || sum == 10){
                System.out.println("Se repeta aruncarea automat");
                continue;
            }
            System.out.println("Doresti sa repeti aruncarea?");
            Scanner scan = new Scanner(System.in);
            condition = scan.nextBoolean();

        }
    }
}
