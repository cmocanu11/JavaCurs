package Curs10;

public class TestTextFileProcessor {
    public static void main(String[] args) {
        TextFileProcessor textFileProcessor = new TextFileProcessor();

        textFileProcessor.writeFile();
        textFileProcessor.readFile();
        System.out.println("--------------------");
        textFileProcessor.appendTextToFile();
        textFileProcessor.readFile();
        textFileProcessor.deleteFile();
    }
}
