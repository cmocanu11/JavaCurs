package Curs8.Tema;

public class Vehicul {
    String brand;
    int nivelPoluare;
    int vitezaMedie;
    String motorizare;

    public String nume(){
        return brand;
    }

    public String motorizare(){
        return motorizare;
    }

    public void detalii(){
        System.out.println("Nivelul de poluare pentru masina "+ brand + " este: "+ nivelPoluare + " si viteza medie atinsa este de "+vitezaMedie+ " km/h");
    }
}
