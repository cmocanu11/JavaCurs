package Curs6;

public class StringComparison {
    public static void main(String[] args) {
        String firstString = "Java";
        String secondString = "automation";
        String thirdString = "Java";
        String fourthString = new String("Java");

        System.out.print("Case: ==: ");
        System.out.println(firstString == secondString);
        System.out.print("Case equals: ");
        System.out.println(firstString.equals(secondString));

        System.out.println("------------------------");
        System.out.print("Case ==: ");
        System.out.println(firstString == thirdString);
        System.out.print("Case equals: ");
        System.out.println(firstString.equals(thirdString));

        System.out.println("------------------------");
        System.out.print("Case ==: ");
        System.out.println(firstString == fourthString);
        System.out.print("Case equals: ");
        System.out.println(firstString.equals(fourthString));

    }
}
