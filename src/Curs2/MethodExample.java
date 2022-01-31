package Curs2;

public class MethodExample {

    /**
     * 1. nr de camere dinamic
     * 2. calcul de mp al fiecarei camere
     * 3. nr total de mp
     */

    /**
     *
     * Clasele folosesc Upper Cammel Case -> CuvantAltCuvant )
     * variabile + metode folosesc lower cammel case -> cuvantAltCuvant
     *
     */

    int numarTotal;

    public static void main(String[] args) {
        //fara metode
        //room1
        int length = 4;
        int width = 2;
        int room1area = length*width;
        System.out.println("Aria camerei 1 este " + room1area);
        //room2
        int length2 = 5;
        int width2 = 6;
        int room2area = length2*width2;
        System.out.println("Aria camerei 2 este " + room2area);

        int nrTotalMp = room1area + room2area;
        System.out.println("Nr total mp = " + nrTotalMp);

        //cu metode
        MethodExample room3 = new MethodExample();
        MethodExample room4 = new MethodExample();
        MethodExample room5 = new MethodExample();

        int hol = room3.calculateArea(2,3); //6
        int baie = room4.calculateArea(4,4); //16
        int dormitor = room5.calculateArea(6,5); //30

        System.out.println("Nr total: " + calculeazaNrTotal(hol, baie, dormitor));

    }

    public int calculateArea(int length, int width){
        return length * width;
    }

    public static int calculeazaNrTotal(int...rooms){
        int result = 0;
        for (int room: rooms){
            result += room;
        }
        return result;
    }



}
