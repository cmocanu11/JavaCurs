package Curs3;

public class StaticVsNonStatic {

    //Instance Area
    public String nume = "Johnny";

    public String printeazaMesaj(){
        return "Salut " + nume;
    }

    //end of Instance area

    //Static area
    public static String prenume = "Bravo";

    public static String printeazaMesajStatic(){
        return "Hello static " + prenume;
    }
    //end of Static area

    public static void main(String[] args) {
        StaticVsNonStatic obj = new StaticVsNonStatic();

        System.out.println("Numele meu este " + obj.nume + " " + prenume);
        System.out.println(obj.printeazaMesaj());
        System.out.println(printeazaMesajStatic());

    }
}
