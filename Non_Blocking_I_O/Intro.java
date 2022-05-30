package Non_Blocking_I_O;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class Intro {
    // this works same as reading the data from one file and writing the data in
    // other file
    // for that we already have the IOStream class of java so the use of this class
    // is when we want to read the data from 1 thread and write the data on other
    // thread

    // basically in IOStream the thread got blocked when we do the input output
    // operation so, to avoid that we use the java.nio class

    // in nio we use the channel to travel the data and use the buffer to store the
    // data

    // basically we can say that channel are the pipes to data and the buffer is the
    // tank of data

    public static void main(String[] args) {

        // this is the case when we want to read from the file

        FileInputStream temp;
        try {
            temp = new FileInputStream("D:\\dsa in java\\Non_Blocking_I_O\\input.txt");
            FileChannel readingChannel = temp.getChannel();
            ByteBuffer buffer = ByteBuffer.allocateDirect(1024);
            int result;
            try {
                result = readingChannel.read(buffer);
                System.out.println("the file data is " + result);
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        } catch (FileNotFoundException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }

        // this is the case when we want to write in the file
        try {
            FileOutputStream outputStream = new FileOutputStream("D:\\dsa in java\\Non_Blocking_I_O\\dest.txt");
            FileChannel channel = outputStream.getChannel();

            ByteBuffer buffer = ByteBuffer.allocate(1024);
            String message = "hi there it is write buffer";
            buffer.put(message.getBytes());
            buffer.flip();
            try {
                channel.write(buffer);
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            System.out.println("writing done");
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
