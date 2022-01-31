package package1;

class DefaultAccessModifier {

    /**
     * daca nu mentionam niciun access modifier
     *
     * Scopul lui este limitat la package-ul in care se afla
     *
     * Same class:                      yes
     * Subclass in acelasi package:     yes
     * Alta clasa in acelasi package:   yes
     *
     * Subclass in alt package:         no
     * Alta clasa in alt package:       no
     */

    String mesaj;

    void printMesaj(){
        System.out.println("Default modifier");
    }

    public static void main(String[] args) {
        DefaultAccessModifier defaultAccessModifier = new DefaultAccessModifier();
        defaultAccessModifier.printMesaj();
    }
}
