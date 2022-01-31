package Curs2.Tema;

public class Shape {

    //Constructori

    public Shape(int length){
        System.out.println("The area of the square is: " + calculateSquareArea(length));
    }

    public Shape(int length, int width){
        System.out.println("The area of the rectangle is: " + calculateRectangleArea(length,width));
    }

    public Shape(double radius){
        System.out.println("The radius of the circle is: " + radius * radius * Math.PI);
    }


    //Metode
    public int calculateSquareArea(int length){
        return length * length;
    }

    public int calculateRectangleArea(int length, int width){
        return length * width;
    }

}
