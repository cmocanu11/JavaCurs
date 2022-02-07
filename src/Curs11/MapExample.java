package Curs11;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {

        Map<String,String> map = new HashMap<>();

        boolean isEmpty = map.isEmpty();

        System.out.println("\n--------------\n");
        System.out.println("Map is empty? " + isEmpty);
        System.out.println("Size of map is: " + map.size());

        map.put("T","Tester");
        map.put("M","Manager");
        map.put("D","Developer");
        map.put("P","ProductOwner");

        System.out.println("\n--------------\n");
        boolean checkKey = map.containsKey("T");
        System.out.println("Contine cheia T : " + checkKey);

        System.out.println("\n--------------\n");
        boolean checkValue = map.containsValue("Developer");
        System.out.println("Contine valoarea developer : " + checkValue);

        System.out.println("\n--------------\n");
        for (String key : map.keySet()){
            System.out.println(key);
        }

        System.out.println("\n--------------\n");
        for (String value: map.values()){
            System.out.println(value);
        }

        System.out.println("\n--------------\n");
        map.remove("M");
        for (String key : map.keySet()){
            System.out.println(key);
        }
        for (String value: map.values()){
            System.out.println(value);
        }
    }
}
