import model.Root;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
       JsonParser parser = new JsonParser();
       Root root = parser.parse();
       System.out.println("model.Root " + root.toString());



    }
}
