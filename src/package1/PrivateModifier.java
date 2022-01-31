package package1;

public class PrivateModifier {

    /**
     * Scopul Private este limitat la clasa in care se afla
     * Clasa sau interfata nu pot fi declarate ca private
     *
     * Same class:                  yes
     * Subclass same package:       no
     * Other class same package:    no
     *
     * Subclass other package:      no
     * Other class other package:   no
     *
     */

    private String mesaj = "Hello";
    public String word = "there";

    public String getMesaj() {
        return mesaj;
    }

    public void setMesaj(String mesaj) {
        this.mesaj = mesaj;
    }

    private void printMesaj(){
        System.out.println(mesaj);
    }

    public static void main(String[] args) {
        PrivateModifier obj = new PrivateModifier();
        obj.printMesaj();
    }

    /**
     * Constructorul privat impiedica crearea unui obiect al acestei clase in afara ei (singleton)
     */
//    private PrivateModifier(){}
}
