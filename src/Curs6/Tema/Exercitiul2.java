package Curs6.Tema;

public class Exercitiul2 {
    public static void main(String[] args) {
        String text = "Eu invat Java";
        char[] charArray = text.toCharArray();
        char[] vocale = {'a','e','i','o','u','A','E','I','O','U'};
        int nrVocale = 0;

        for (char c:charArray) {
            for (char vocala:vocale) {
                int comparatie = Character.compare(c,vocala);
                if (comparatie == 0){
                    nrVocale ++;
                }
            }
        }
        System.out.println("Numarul de vocale este de " + nrVocale);
    }
}
