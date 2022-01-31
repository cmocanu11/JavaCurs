package package2;

import package1.ProtectedAccessModifier;

public class SubClassProtectedModifier extends ProtectedAccessModifier {
    public static void main(String[] args) {
        SubClassProtectedModifier obj = new SubClassProtectedModifier();
        System.out.println(obj.unu);
        obj.printDoi();
    }
}
