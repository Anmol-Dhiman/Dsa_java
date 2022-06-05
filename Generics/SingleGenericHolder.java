package Generics;


// this is the single parameter Generic 
public class SingleGenericHolder<T> {

    T obj;

    SingleGenericHolder(T obj) {
        this.obj = obj;
    }

    public T getObjectValue() {
        return obj;
    }

    public static void main(String[] args) {
        SingleGenericHolder<Integer> object = new SingleGenericHolder<Integer>(10);
        System.out.println(object.getObjectValue());

        SingleGenericHolder<String> object2 = new SingleGenericHolder<String>("Hello world");
        System.out.println(object2.getObjectValue());
    }

}
