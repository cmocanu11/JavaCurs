package Curs10.Tema;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.Set;

public class ReadCalories {

    public String readProperties(String key) throws IOException {
        InputStream inputStream = new FileInputStream("src/Curs10/Tema/legume.properties");
        Properties prop = new Properties();
        prop.load(inputStream);
        String value = prop.getProperty(key);
        return value;
    }

    public Object[] readKeys() throws IOException {
        InputStream inputStream = new FileInputStream("src/Curs10/Tema/legume.properties");
        Properties prop = new Properties();
        prop.load(inputStream);
        Set<Object> keys = prop.keySet();
        Object[] key = keys.stream().toArray();
        return key;
    }
}
