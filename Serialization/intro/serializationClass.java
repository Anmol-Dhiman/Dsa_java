package Serialization.intro;

import java.io.Serializable;

public class serializationClass implements Serializable {

    // if we don't want some of the variable to travel through singla and reach to
    // the other computer
    // so for that we use the transient keyword
   
//    in this case the object do have to variable b after deserialization but it's value would be 0 

    int a;
    transient int b = 1;

    serializationClass(int a) {
        this.a = a;
    }

}
