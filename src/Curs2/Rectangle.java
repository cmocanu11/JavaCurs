package Curs2;

public class Rectangle {
    //variabile de clasa
    private int length;
    private int width;
    private int bigArea;
    public static int ceva = 5;

    //constructori
    public Rectangle(){
        length = 6;
        width = 5;
    }

    public Rectangle(int length, int width){
        setLength(length);
        setWidth(width);
    }

    public Rectangle(int length, int width, int bigArea){
        setLength(length);
        setWidth(width);
        this.bigArea = bigArea;
    }

    //Metode
    public void setLength(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getWidth() {
        return width;
    }

    public int calculateArea(){
        return length * width;
    }

    public int calculateNumberOfRectangles(){
        return bigArea / calculateArea();
    }
}
