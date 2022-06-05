package Serialization.intro;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
 

public class intro {
    // when we have to send the object on a network line then we have to divide the
    // object into bits and that division process is called Serialization.
    // and reverting back i.e. collecting those bits and converting them to the java
    // object is known as deserialization


    // 1. when we serialize the object then it loss it's class type that why we have to typecast while deserializing the object     

    // to see Serialization we have to use the other computer to send the object on
    // network so for solving that we can Serialize the object and save it into the
    // file
    public static void main(String[] args) {
        serializationClass temp = new serializationClass(12);

        String fileName = "D:\\main.txt";

        // objects for taking the refernce to file
        // output stream for writing in the file 
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;

        
        // Serialization occuring
        try {

            fileOutputStream = new FileOutputStream(fileName);

            objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(temp);
            fileOutputStream.close();
            objectOutputStream.close();

            System.out.println("the object has been added");
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }


        // intput stream for reading from file 
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;

        // deserialization occuring 
        try {
            fileInputStream = new FileInputStream(fileName);
            objectInputStream = new ObjectInputStream(fileInputStream);
          
            serializationClass obj = (serializationClass) objectInputStream.readObject();
            fileInputStream.close();
            objectInputStream.close();

            System.out.println(obj.a);
            
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
