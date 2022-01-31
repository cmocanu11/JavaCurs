package package1;

public class OtherClassProtectedAccessModifier {
    public static void main(String[] args) {
        ProtectedAccessModifier obj = new ProtectedAccessModifier();
        System.out.println(obj.unu);
        obj.printDoi();
    }
}
