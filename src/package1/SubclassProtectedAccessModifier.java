package package1;

public class SubclassProtectedAccessModifier extends ProtectedAccessModifier{
    public static void main(String[] args) {
        SubclassProtectedAccessModifier obj = new SubclassProtectedAccessModifier();
        System.out.println(obj.unu);
        obj.printDoi();
    }
}
