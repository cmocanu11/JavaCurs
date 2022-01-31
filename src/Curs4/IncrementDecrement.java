package Curs4;

public class IncrementDecrement {
    public static void main(String[] args) {
        //num1++ --> post-increment
        //num1 =  num1+1

        /*++num1 --> pre-increment
         *
         */

        int num1 = 10;
        int num2 = 10;
        System.out.println("valoarea lui num1 inainte de post-increment: "+ num1);
        System.out.println("valoarea lui num1 in post-increment: "+ num1++);
        System.out.println("valoarea lui num1 acum: "+ num1);
        System.out.println();
        System.out.println("valoarea lui num2 inainte de pre-increment: "+ num2);
        System.out.println("valoarea lui num2 in pre-increment: "+ ++num2);
        System.out.println("valoarea lui num2" +
                " acum: "+ num2);

        int num3 = 10;
        //pre increment
        ++num3;
        //post increment
        num3++;

        //pre decrement
        --num3;
        //post decrement
        num3--;


    }
}
