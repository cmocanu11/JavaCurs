package Curs4;

public class Palindrom {

    public void checkIfWordIsPalindrome(String word){
        //radar     --> e palindrom
        //masina    --> nu e palindrom

        int length = word.length();
        String inversedWord = "";

        for (int i=length-1; i>=0; i--){
            inversedWord = inversedWord + word.charAt(i);
        }
        if(word.equals(inversedWord)){
            System.out.println("Cuvantul este palindrom");
        } else {
            System.out.println("Cuvantul nu este palindrom");
        }
    }
}
