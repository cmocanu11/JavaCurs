package Curs1;

public class Tester {
    //Variabile
    String name;
    int ratePerHour;
    int age;

    //constructor
    public Tester(){}
    public Tester(String nume, int ratePerHour){
        setName(nume);
        setRatePerHour(ratePerHour);
    }

    //Metode
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getRatePerHour() {
        return ratePerHour;
    }

    public void setRatePerHour(int ratePerHour) {
        this.ratePerHour = ratePerHour;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
