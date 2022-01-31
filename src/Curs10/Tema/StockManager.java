package Curs10.Tema;

import java.io.IOException;

public class StockManager {
    Object[] keys;

    public StockManager() throws IOException {
        ReadCalories readCalories = new ReadCalories();
        keys = readCalories.readKeys();
    }

    public boolean checkVegetableIsInStock(String name) {

        for (Object key : keys) {
            if (name.equals(key))
                return true;
        }
        return false;
    }

}

