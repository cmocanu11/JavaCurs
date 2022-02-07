package Curs11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample2 {
    public static void main(String[] args) {

        List<String> arrayList = new ArrayList<>(Arrays.asList("Zero","Unu","Doi","Trei","Patru","Cinci"));

        System.out.println("\n--------------");
        System.out.println("Print array list size: " + arrayList.size());
        for (String nume:arrayList ) {
            System.out.println(arrayList.indexOf(nume) + " - " + nume);
        }
        arrayList.add("Sase");
        System.out.println("\n--------------");
        System.out.println("Print array list size: " + arrayList.size());
        for (String nume:arrayList ) {
            System.out.println(arrayList.indexOf(nume) + " - " + nume);
        }

        System.out.println("\n--------------");
        for (String nume:arrayList.subList(1,arrayList.indexOf("Cinci")+1)) {
            System.out.println(arrayList.indexOf(nume) + " - " + nume);
        }

        System.out.println("\n--------------");
        //remove range
        arrayList.subList(1,4).clear();
        for (String nume:arrayList ) {
            System.out.println(arrayList.indexOf(nume) + " - " + nume);
        }

        System.out.println("\n--------------");
        String element = "Zero";
        if (arrayList.contains(element)){
            System.out.println(element + " exista");
        }else{
            System.out.println(element + " nu exista");
        }

        //update elemenet
        System.out.println("\n--------------");
        arrayList.set(0,"Opt");
//        System.out.println(arrayList.get(0));
        for (String nume:arrayList ) {
            System.out.println(arrayList.indexOf(nume) + " - " + nume);
        }

        System.out.println("\n--------------");
        Iterator<String> iterator = arrayList.iterator();
//        System.out.println(iterator.next());
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }
}
