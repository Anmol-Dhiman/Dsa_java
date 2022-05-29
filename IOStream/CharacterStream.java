package IOStream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStream {
    public static void main(String[] args) throws IOException {
        FileReader val1 = null;
        FileWriter val2 = null;

        try {
            val1 = new FileReader("D:\\dsa in java\\IOStream\\input.txt");
            val2 = new FileWriter("D:\\dsa in java\\IOStream\\destination.txt");
            System.out.println(val1);
            System.out.println(val2);

            int content;
            // this is for reading the data from the input.txt file character by character
            // and writing those characters into the destination file
            while ((content = val1.read()) != -1) {
                val2.append((char) content);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (val1 != null) {
                val1.close();
            }
            if (val2 != null) {
                val2.close();
            }
        }
    }
}
