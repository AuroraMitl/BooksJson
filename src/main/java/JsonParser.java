import model.Root;
import model.Writers;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.stream.Stream;


public class JsonParser {

    public Root parse() throws IOException {
        int addition = 100500;
        Root root = new Root();
        JSONParser parser = new JSONParser();


        try(
           FileReader reader = new FileReader("documents.json"))
            {

                JSONObject rootJsonObject = (JSONObject) parser.parse(reader);

                String booksShop = (String) rootJsonObject.get("booksShop");
                List<Writers> writers = (List<Writers>) rootJsonObject.get("writers");
                List<Long> numbers = (List<Long>) rootJsonObject.get("listOfNumbers");

                root.setBooksShop(booksShop);
                root.setWriters(writers);
                root.setListOfNumbers(numbers);

                Stream.builder().add(writers).add(booksShop).
                        build().
                        forEach(s -> System.out.println("StreamAPI: " + s));

                numbers.stream().
                        map(x->x+addition).
                        forEach(s -> System.out.println("StreamAPI numbers: " + s));

                return root;


            } catch(FileNotFoundException | ParseException e){
                e.printStackTrace();
            }
        return null;
        }

     }





