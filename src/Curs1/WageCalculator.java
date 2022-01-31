package Curs1;

public class WageCalculator {

    int nrOreLucrate = 40;

    public static void main(String[] args) {

        WageCalculator wageCalculator = new WageCalculator();

        //Instantiere tester1 + calcul salariu
        Tester tester1 = new Tester();
        tester1.setName("Cosmin");
        tester1.setRatePerHour(40);
        tester1.setAge(28);
        System.out.println("Salariul lui " + tester1.getName() + " este de " + wageCalculator.calculareSalariu(tester1.getRatePerHour()) +" lei.");
        System.out.println(tester1.getName() + " are : " + tester1.getAge() + " ani");

        //Instantiere tester2 + calcul salariu
        Tester tester2 = new Tester();
        tester2.setName("Alexandra");
        tester2.setRatePerHour(25);
        tester2.setAge(25);
        System.out.println("Salariul lui " + tester2.getName() + " este de " + wageCalculator.calculareSalariu(tester2.getRatePerHour()) + " lei.");
        System.out.println(tester2.getName() + " are : " + tester2.getAge() + " ani");
    }

    public int calculareSalariu(int ratePerHour){
        return nrOreLucrate * ratePerHour;
    }
}
