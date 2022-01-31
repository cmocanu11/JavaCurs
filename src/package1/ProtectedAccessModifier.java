package package1;

public class ProtectedAccessModifier {

    /**
     * Scopul Protected este in acelasi packet si subclase din package-uri diferite
     * Clasele nu pot fi declarate ca protected
     *
     * Same class:                  yes
     * Subclass same package:       yes
     * Other class same package:    yes
     *
     * Subclass other package:      yes
     * Other class other package:   no
     *
     */

    protected String unu = "Unu";

    protected void printDoi(){
        System.out.println("Doi");
    }

    public static void main(String[] args) {
        ProtectedAccessModifier obj = new ProtectedAccessModifier();
        System.out.println(obj.unu);
        obj.printDoi();
    }

}
