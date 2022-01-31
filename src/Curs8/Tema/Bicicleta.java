package Curs8.Tema;

public class Bicicleta extends Vehicul{
    public Bicicleta(String brand, int nivelPoluare, int vitezaMedie){
        super.brand = brand;
        super.nivelPoluare = nivelPoluare;
        super.vitezaMedie = vitezaMedie;
    }

    @Override
    public String nume() {
        return "numele bicicletei este "+ brand;
    }

    @Override
    public String motorizare(){

        return "Bicicleta nu are motorizare";
    }

    @Override
    public void detalii() {
        System.out.println("Bicicleta "+ super.brand + " are viteza medie de "+super.vitezaMedie+ " km/h");
    }
}
