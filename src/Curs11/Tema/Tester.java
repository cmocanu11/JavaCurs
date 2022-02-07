package Curs11.Tema;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {

        Map<String, Integer> catalog = new HashMap<>();

        catalog.put("cosmin",5);
        catalog.put("ionut",7);

        Scanner scan = new Scanner(System.in);
        System.out.println("Cum te cheama?");
        String nume = scan.next();

        System.out.println("Ce nota ai luat?");
        int nota = scan.nextInt();

        if (!catalog.containsKey(nume.toLowerCase())){
            System.out.println("Nu aveai nota, ti-am trecut-o acum");
            catalog.put(nume.toLowerCase(),nota);
        }
        else if(nota < catalog.get(nume.toLowerCase())){
            System.out.println("Nu ai nevoie de alta nota");
        } else {
            System.out.println("Ti-am trecut nota noua");
            catalog.replace(nume.toLowerCase(),nota);
        }

        System.out.println(catalog);
    }
}
