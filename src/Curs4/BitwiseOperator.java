package Curs4;

public class BitwiseOperator {
    public static void main(String[] args) {
        /**
         * &&   --> short circuit
         * &    --> and
         *
         * (x!=0) & (1/x>5)     --> evalueaza daca x!=0, dupa aceea evalueaza 1/x>5, dupa aceea aplica conditia &
         *
         * (x!=0) && (1/x>5)    --> evalueaza x!=0, daca este true evalueaza  1/x>5
         *
         * a|b  --> evalueaza a, evalueaza b, dupa aceea face |
         * a||b --> evalueaza a si doar daca a este false, evalueaza b
         */

        int x = 0;

        if((x!=0) && (1/x>5)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }

    }
}
