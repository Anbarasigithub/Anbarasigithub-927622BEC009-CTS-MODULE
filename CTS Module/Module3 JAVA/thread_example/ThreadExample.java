package thread_example;

public class ThreadExample {
    public static void main(String[] args) {
        MessageThread thread1 = new MessageThread("Thread 1 says hello");
        MessageThread thread2 = new MessageThread("Thread 2 is running");

        thread1.start();
        thread2.start();
    }
}
