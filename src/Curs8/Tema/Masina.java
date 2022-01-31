package Curs8.Tema;

public class Masina extends Vehicul{
    public Masina(String brand, int nivelPoluare, int vitezaMedie,String motorizare){
        super.brand = brand;
        super.nivelPoluare = nivelPoluare;
        super.vitezaMedie = vitezaMedie;
        super.motorizare = motorizare;
    }


    @Override
    public String nume() {
        return "numele masinii este "+ brand;
    }

    @Override
    public String motorizare(){

        return "Masina are motorizarea de " + super.motorizare +"l";
    }

    @Override
    public void detalii() {
        System.out.println("Nivelul de poluare pentru masina "+ super.brand + " este: "+ super.nivelPoluare + " si viteza medie atinsa este de "+super.vitezaMedie+ " km/h cu motorizarea de "+ super.motorizare +"l");
    }

}
