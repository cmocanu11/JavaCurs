package Curs10.Tema;

import java.io.IOException;
import java.util.Scanner;

public class TestTema {

    public static void main(String[] args) throws IOException {

        ReadCalories readCalories = new ReadCalories();
        StockManager stockManager = new StockManager();
        Scanner scan = new Scanner(System.in);
        String leguma;
        boolean condition = true;

        System.out.println("Ce leguma vrei sa cumperi?");
        do{
            leguma = scan.nextLine();
            if (stockManager.checkVegetableIsInStock(leguma) == true){
                System.out.println("Leguma "+ leguma+ " are "+ readCalories.readProperties(leguma) + " calorii");
                condition = false;
            } else {
                System.out.println("Nu vindem aceasta leguma! "+
                        "\nTe rugam sa alegi alta leguma");
            }
        } while(condition);
    }
}
