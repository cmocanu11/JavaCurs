package Curs7;

public class Square extends Shape{

    String shapeName = "Square";
    String shapeColor = "Black";

    public Square(){
        System.out.println("Square class constructor");
    }

    //constructor cu parametrii
    public Square(String color, String name) {
//        super(color, name);
        this.shapeColor = color;
        this.shapeName = name;
    }


    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("The shape name is: " + shapeName + " and the color is: " + shapeColor);
    }
}
