package Curs7;

public class TestFinalMethod extends FInalMethod{

    public void test(){
        System.out.println("Test method in TestFinalMethod class");
    }


    public static void main(String[] args) {
        TestFinalMethod obj = new TestFinalMethod();
        obj.demo();
        obj.test();
        FInalMethod finals = new FInalMethod();
        finals.test();
    }
}
