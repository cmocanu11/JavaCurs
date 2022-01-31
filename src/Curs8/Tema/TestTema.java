package Curs8.Tema;

public class TestTema {
    public static void main(String[] args) {
        Bicicleta bicla = new Bicicleta("BMX",0,14);
        bicla.detalii();
        verificaMotorizare(bicla);

        Masina masina = new Masina("BMW", 8,220,"3.0");
        masina.detalii();
        verificaMotorizare(masina);

    }
    public static void verificaMotorizare(Vehicul vehicul){
        System.out.println(vehicul.nume() + ". " + vehicul.motorizare());
    }
}


