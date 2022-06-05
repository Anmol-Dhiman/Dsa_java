package Concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class FutureClassDemo {
    public static void main(String[] args) {
        ExecutorService temp = Executors.newSingleThreadExecutor();

        // this program will run in different thread
        Future<String> val = temp.submit(() -> {
            Thread.sleep(10000);
            return "completed";
        });
        try {
            // this program will run in different thread
            int i = 1;
            while (!val.isDone()) {
                System.out.println("task in running the backgroung thread " + i++);

                Thread.sleep(500);

            }
            System.out.println("task completed");
            String result = val.get(3000, TimeUnit.MILLISECONDS);
            System.out.println(result);
            temp.shutdown();
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }

}
