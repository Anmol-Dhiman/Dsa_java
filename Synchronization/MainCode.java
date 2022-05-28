package Synchronization;

public class MainCode {
    public static void main(String[] args) {
        Intro intro = new Intro();

        // here both the threads are using the same object so we can use the
        // synchronized keyword on the critical code area of that object
        Thread1 temp = new Thread1(intro);
        Thread temp1 = new Thread(new Thread2(intro));
        temp.start();
        temp1.start();

    }
}
