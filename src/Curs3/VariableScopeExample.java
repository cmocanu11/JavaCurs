package Curs3;

public class VariableScopeExample {

    //instance variable
    String prenume;


    public static void main(String[] args) {
        VariableScopeExample obj = new VariableScopeExample();
        obj.prenume = "Bravo";
        System.out.println(obj.prenume);
        System.out.println(obj.printeazaNume());
        System.out.println(obj.prenume);
    }

    public String printeazaNume(){
        //Locale variable
        String nume = null;
        ///
        prenume = "Altceva";
        return nume;
    }
}
