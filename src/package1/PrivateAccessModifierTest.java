package package1;

import java.io.PrintStream;

public class PrivateAccessModifierTest extends PrivateModifier{

    public static void main(String[] args) {
        PrivateAccessModifierTest obj = new PrivateAccessModifierTest();
        System.out.println(obj.word);
        System.out.println(obj.getMesaj());

//        PrivateModifier obj2 = new PrivateModifier();
//        System.out.println(obj2.getMesaj());

    }
}
