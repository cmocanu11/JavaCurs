package Curs8;

public class TestAnimal {

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeSound();

        System.out.println("------------------");

//        Deer bambi = new Deer();
//        bambi.makeSound();
//        bambi.eatGrass();

        System.out.println("------------------");

//        Lion simba = new Lion();
//        simba.makeSound();
//        simba.eatMeat();

        //WebDriver driver = new ChromeDriver();

        Animal simba = new Lion();
        simba.makeSound();
        ((Lion) simba).eatMeat();
        feedAnimal(simba);

        simba = new Deer();
        simba.makeSound();
        ((Deer) simba).eatGrass();
        feedAnimal(simba);

    }
    public static void feedAnimal(Animal object){
        if(object instanceof Lion){
            System.out.println("you are getting burgers!");
        } else if (object instanceof Deer){
            System.out.println("you are getting salad");
        }
    }

}
