package Curs7;

public class FinalVariableExample {

    public final int VALUE = 100;
    public final int BLANK;

    public FinalVariableExample(int BLANK) {
        this.BLANK = BLANK;
    }

    public void demo(){
        System.out.println(VALUE + " " + BLANK);
    }


    public static void main(String[] args) {
        FinalVariableExample obj = new FinalVariableExample(150);
        obj.demo();

    }
}
