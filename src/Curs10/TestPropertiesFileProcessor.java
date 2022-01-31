package Curs10;

import java.io.IOException;

public class TestPropertiesFileProcessor {
    public static void main(String[] args) throws IOException {
        PropertiesFileProcessor propertiesFileProcessor = new PropertiesFileProcessor();

        propertiesFileProcessor.writePropertiesFile();

        propertiesFileProcessor.readProperties("email");
    }
}
