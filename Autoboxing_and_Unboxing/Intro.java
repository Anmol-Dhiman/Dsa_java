package Autoboxing_and_Unboxing;

public class Intro {
    // the conversion between primitive data type and corresponding object wrapper
    // class(parent class of all the classes by default) is called autoboxing
    // and it's vice versa is called the unboxing /

    public static void main(String args[]) {

        // autoboxing: - primitive to object 
        int a = 2;
        Integer integer = Integer.valueOf(a);
        System.out.println(integer);

        // unboxing: -object to primitive
        Integer b =a;
        
        System.out.println(b);
    }

}
