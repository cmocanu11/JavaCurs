package Curs6;

public class ForEachExample1 {
    public static void main(String[] args) {

        int[] number = {10,20,30,40};

        for (int i = 0; i < number.length ; i++) {
            System.out.println("Classic for :" + number[i]);
        }

        //codul de mai jos este echivalent cu cel de mai sus

        for (int num :number) {
            System.out.println("For each :" + num);
        }

        System.out.println("----- Another example -----");

        String[] cities = {"Iasi", "Cluj", "Arad", "Alba", "Oradea"};

        for (String oras:cities) {

            if (oras.equals("Arad")){
                continue;
            }

            System.out.println(oras);

        }




    }
}
