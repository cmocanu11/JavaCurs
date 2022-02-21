package Curs13.Tema;

public class Tema {

    public static void main(String[] args) {

        String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam consectetur odio ac quam commodo, eu eleifend felis imperdiet. Integer bibendum nunc quis sem faucibus, vitae laoreet mi dignissim. Praesent eget ligula nec lorem varius malesuada. Nulla neque lacus, euismod quis erat nec, convallis vestibulum augue. Nullam et aliquet justo. Aliquam erat volutpat. Nulla elementum urna in dolor viverra, in efficitur lectus mattis.";
        numberOfApperances(text);
        System.out.println("");
        impartireInPropozitii(text);
        System.out.println("");

        deleteCharacter(text,'a');
        System.out.println("");

        replaceCharacterWithAnotherCharacter(text,'o','#');
    }



    public static void numberOfApperances(String text){
        String[] a = text.split(" ");
        int appearances = 0;
        for(int i = 0 ; i<a.length;i++){
            if (a[i].equals("Nulla")){
                appearances++;
                i++;
            }
        }
        System.out.println("Cuvantul Nulla apare de "+ appearances + " ori.");
    }

    public static void impartireInPropozitii(String text){
        String[] a = text.split("\\.");
        for(int i = 0 ; i<a.length;i++){
            System.out.println(a[i]);
        }
    }

    public static void deleteCharacter(String text, char ch){
        StringBuilder sb = new StringBuilder(text);
        for(int i = 0 ; i<sb.length();i++){
            if (i!=0 && sb.charAt(i)==ch){
                sb.deleteCharAt(i);
                i++;
            }
        }
        System.out.println(sb);
    }

    public static void replaceCharacterWithAnotherCharacter(String text, char characterToBeReplaced, char charactorToReplace){
        StringBuilder sb = new StringBuilder(text);
        for(int i = 0 ; i<sb.length();i++){
            if (i!=0 && sb.charAt(i)==characterToBeReplaced){
                sb.deleteCharAt(i);
                sb.insert(i,charactorToReplace);
                i++;
            }
        }
        System.out.println(sb);
    }

}
