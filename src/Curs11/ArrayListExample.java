package Curs11;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

    public static void main(String[] args) {

        //Obiect arr[] = new Obiect[6]
        List<String> list = new ArrayList<>();

        List<Integer> list2 = new ArrayList<>();

        //add element to array list
        list.add("Ioana");
        list.add("Ion");
        list.add("George");
        list.add("Georgiana");

        System.out.println("Print array list size: " + list.size());

        //get element by index
        System.out.println("get element at index: " + list.get(3));

        //display elements
        for (String nume:list ) {
            System.out.println(list.indexOf(nume) + " - " + nume);
        }
        System.out.println("\n--------------");
        System.out.println("Print array list size: " + list.size());

        list.add(4,"Tara");
        System.out.println("Print array list size: " + list.size());
        for (String nume:list ) {
            System.out.println(list.indexOf(nume) + " - " + nume);
        }

        list.add("Mara");
        System.out.println("\n--------------");
        System.out.println("Print array list size: " + list.size());
        for (String nume:list ) {
            System.out.println(list.indexOf(nume) + " - " + nume);
        }

        //remove
        list.remove("Mara");
        System.out.println("\n--------------");
        System.out.println("Print array list size: " + list.size());
        for (String nume:list ) {
            System.out.println(list.indexOf(nume) + " - " + nume);
        }

        list.remove(2);
        System.out.println("\n--------------");
        System.out.println("Print array list size: " + list.size());
        for (String nume:list ) {
            System.out.println(list.indexOf(nume) + " - " + nume);
        }

        //remove all elements
        list.clear();
        System.out.println("\n--------------");
        System.out.println("Print array list size: " + list.size());
        for (String nume:list ) {
            System.out.println(list.indexOf(nume) + " - " + nume);
        }
    }
}
