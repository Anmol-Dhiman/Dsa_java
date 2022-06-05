package IOStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


// when we are dealing with the databases or the images then we have to use the byteStream as they have to travel in bytes 
public class ByteStream {
    public static void main(String[] args) throws IOException {
        FileInputStream val1 = null;
        FileOutputStream val2 = null;

        try {
            val1 = new FileInputStream("D:\\dsa in java\\IOStream\\input.txt");
            val2 = new FileOutputStream("D:\\dsa in java\\IOStream\\destination.txt");
            System.out.println(val1);
            System.out.println(val2);

            int content;
            // here we are reading the input file and writing in destincation file byte by
            // byte
            while ((content = val1.read()) != -1) {
                val2.write((byte) content);
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
