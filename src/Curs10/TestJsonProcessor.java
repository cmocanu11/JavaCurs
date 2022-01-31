package Curs10;

public class TestJsonProcessor {

    public static void main(String[] args) {
        JsonProcessor jsonProcessor = new JsonProcessor();
//        jsonProcessor.writeJsonFile();
        jsonProcessor.readJsonFile("name");
        System.out.println();
    }
}
