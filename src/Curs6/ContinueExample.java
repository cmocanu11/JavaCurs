package Curs6;

public class ContinueExample {
    public static void main(String[] args) {
        System.out.println("For");
        for (int i = 0 ; i < 10 ; i++){
            if(i == 4){
                continue;
            }
            System.out.println(i);
        }

        System.out.println("While");
        int j = 6;
        while (j>0){
            if (j==3){
                continue;
            }
            System.out.println(j);
            j--;
        }
    }
}
