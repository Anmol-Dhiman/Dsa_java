package Synchronization;

public class Thread2 implements Runnable {

    Intro temp;

    Thread2(Intro temp) {
        this.temp = temp;
    }

    @Override
    public void run() {
        temp.getMultiple(3);
    }

}
