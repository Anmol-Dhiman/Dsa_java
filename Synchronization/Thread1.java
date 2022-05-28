package Synchronization;

public class Thread1 extends Thread {

    Intro temp;

    Thread1(Intro temp) {
        this.temp = temp;
    }

    @Override
    public void run() {
        temp.getMultiple(2);
    }
}
