package Generics;

// we can take key value pair as the example of double generic holder 
public class MultiGenericHolder<T, V> {
    T obj1;
    V obj2;

    MultiGenericHolder(T objT, V objV) {
        obj1 = objT;
        obj2 = objV;
    }

    public T getT() {
        return obj1;
    }

    public V getV() {
        return obj2;
    }

    public static void main(String[] args) {
        MultiGenericHolder<Integer, String> temp = new MultiGenericHolder<Integer, String>(1, "hello world");
        System.out.println(temp.getV());
        System.out.println(temp.getT());
    }

}
