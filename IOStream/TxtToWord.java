package IOStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TxtToWord {
    public static void main(String[] args) {
        FileInputStream val1 = null;
        FileOutputStream val2 = null;

        try {
            val1 = new FileInputStream("D:\\dsa in java\\IOStream\\input.txt");
            val2 = new FileOutputStream("D:\\dsa in java\\IOStream\\des.c");
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
                try {
                    val1.close();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
            if (val2 != null) {
                try {
                    val2.close();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
    }
}
