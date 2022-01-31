package Curs3.tema;

public class TestCar {
    public static void main(String[] args) {
        Car obiect = new Car("BMW", "Diesel");
        System.out.println(Car.carDetails());

        Car obiect2 = new Car("Mercedes", "Benzina");
        Car.type = "Sedan";
        System.out.println(Car.carDetails());
        System.out.println(Car.carDetails());

        // Valorile afisate la a 3-a rulare, sunt corecte (brand: Mercedes, engine: Benzina, type:Sedan) deoarece variabilele din clasa Car sunt statice
    }
}
