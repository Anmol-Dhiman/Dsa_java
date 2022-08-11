package Concurrency;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExectuorSample {
    public static void main(String[] args) {
        exectuor();
        executorService();
    }

    public static void exectuor() {
        Executor temp = new Caller();
        temp.execute(() -> {
            System.out.println("executor method running");
        });
    }

    public static void executorService() {

        // this is use to the asynchronous task(running in parallel)
        // here we also provide the number of threads we want to do the work stated in
        // the lambda function
        // or we can also use the single thread for the work based on our usecase
        ExecutorService temp = Executors.newFixedThreadPool(10);
        temp.submit(() -> {
            System.out.println("executor service is running");
        });
    }
}
