package Curs10;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.Iterator;

public class JsonProcessor {

    public void writeJsonFile() {

        JSONObject object = new JSONObject();
        object.put("name", "testUser");
        JSONArray list = new JSONArray();
        list.add("Obiect 1");
        list.add("Obiect 2");
        list.add("Obiect 3");
        list.add("Obiect 4");
        object.put("listaObiecte",list);

        try (FileWriter file = new FileWriter("test.json")){

            file.write(object.toJSONString());

        }catch (IOException e){
            System.out.println("An error occured!");
            e.printStackTrace();
        }
        System.out.println(object);
    }

    public void readJsonFile(String key){
        JSONParser jsonParser = new JSONParser();

        try{
            Reader fileReader = new FileReader("test.json");
            JSONObject obj = (JSONObject) jsonParser.parse(fileReader);
            String jsonKey = (String) obj.get(key);
            System.out.println(jsonKey);

            JSONArray jsonArray = (JSONArray) obj.get("listaObiecte");
            Iterator<String> it = jsonArray.iterator();
            while (it.hasNext()){
                System.out.println(it.next());
            }

        }catch (IOException err){
            System.out.println("An error occured!");
            err.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
