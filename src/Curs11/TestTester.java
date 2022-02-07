package Curs11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class TestTester {
    public static void main(String[] args) {
        Tester t1 = new Tester("Oana",22,"QA");
        Tester t2 = new Tester("Ion",28,"DEV");
        Tester t3 = new Tester("Maria",30,"QA");

        List<Tester> testerList = new ArrayList<>();

//        testerList.add(t1);
//        testerList.add(t2);
//        testerList.add(t3);
        testerList.addAll(Arrays.asList(t1,t2,t3));
        for (Tester t:testerList) {
            System.out.println(t.name + " | "+ t.age + " | " + t.department);
        }

        System.out.println("\n--------------");

        Iterator<Tester> iterator = testerList.iterator();
        while (iterator.hasNext()){
            Tester test = iterator.next();
            System.out.println(test.department);
        }


    }
}
