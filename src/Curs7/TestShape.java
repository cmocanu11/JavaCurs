package Curs7;

public class TestShape {
    public static void main(String[] args) {

        Square patrat = new Square("Yellow","patrat");
        patrat.displayDetails();
        System.out.println(patrat.shapeSize);
//        System.out.println(patrat.shapeWeight);    --> nu avem acces pentru ca este declarat private

        Square patrat2 = new Square();
        patrat2.displayDetails();



    }
}
/**
 *
 * Access location          public      protected       default     private
 *
 *
 * same class               yes         yes             yes         yes
 *
 *
 * subclass in same         yes         yes             yes         no
 * package
 *
 *
 * other class in           yes         yes             yes         no
 * same package
 *
 *
 * subclasses in            yes         yes             no          no
 * other packages
 *
 *
 * Non subclasses in        yes         no              no          no
 * other packages
 *
 */
