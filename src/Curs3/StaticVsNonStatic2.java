package Curs3;

public class StaticVsNonStatic2 {

    //Instance zone
    public String nume;
    //End of instance zone

    //Static zone
    public static String departament = "QA";
    //End of static zone

    public static void main(String[] args) {
        //Obj 1
        StaticVsNonStatic2 person = new StaticVsNonStatic2();
        person.nume = "Vasilica";
        System.out.println(person.nume + " lucreaza in departamentul " + departament);

        //Obj 2
        StaticVsNonStatic2 person2 = new StaticVsNonStatic2();
        person2.nume = "Ionel";
        System.out.println(person2.nume + " lucreaza in departamentul " + departament);
        departament = "DEV";

        //Obj 3
        StaticVsNonStatic2 person3 = new StaticVsNonStatic2();
        person3.nume = "Georgica";
        System.out.println(person3.nume + " lucreaza in departamentul " + departament);

        ///
        System.out.println("----------------------------------------------");
        System.out.println(person.nume + " lucreaza in departamentul " + departament);
        System.out.println(person2.nume + " lucreaza in departamentul " + departament);
        System.out.println(person3.nume + " lucreaza in departamentul " + departament);

    }
}
