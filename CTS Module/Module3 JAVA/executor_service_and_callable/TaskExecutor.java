package executor_service_and_callable;

import java.util.concurrent.*;

public class TaskExecutor {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        Callable<Integer> task1 = () -> {
            Thread.sleep(1000);
            return 10;
        };

        Callable<Integer> task2 = () -> {
            Thread.sleep(2000);
            return 20;
        };

        Callable<Integer> task3 = () -> {
            Thread.sleep(3000);
            return 30;
        };

        Future<Integer> result1 = executor.submit(task1);
        Future<Integer> result2 = executor.submit(task2);
        Future<Integer> result3 = executor.submit(task3);

        try {
            System.out.println("Task 1 result: " + result1.get());
            System.out.println("Task 2 result: " + result2.get());
            System.out.println("Task 3 result: " + result3.get());
        } catch (InterruptedException | ExecutionException e) {
            System.out.println("Error retrieving task result: " + e.getMessage());
        }

        executor.shutdown();
    }
}
