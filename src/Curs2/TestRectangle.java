package Curs2;

public class TestRectangle {




    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        System.out.println("Rectangle1: " + rectangle1.calculateArea());
        rectangle1.setLength(6);
        rectangle1.setWidth(2);
        System.out.println("Rectangle1.1: " + rectangle1.calculateArea());

        Rectangle rectangle2 = new Rectangle();
        System.out.println("Rectangle2: " + rectangle2.calculateArea());

        Rectangle rectangle3 = new Rectangle(3,3);
        System.out.println("Rectangle3: " + rectangle3.calculateArea());

        Rectangle rectangle4 = new Rectangle(5,2,5);
        System.out.println("No of rectangles in bigArea of rectangle4 is: " + rectangle4.calculateNumberOfRectangles());

    }
}
