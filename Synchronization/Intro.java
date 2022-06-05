package Synchronization;


public class Intro {

    // when 2 or more thread accessing the same object then it can cause the errors in
    // the output (race condition)
    // to overcome that problem we use the Syncronizatoin

    // it locks that block for only 1 thread and after the execution of 1 thread,
    // the other thread runs that code block

    void getMultiple(int a) {
        synchronized (this) {
            for (int i = 1; i < 6; i++) {
                System.out.println(a * i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    
                    e.printStackTrace();
                }
            }
        }
    }

}
