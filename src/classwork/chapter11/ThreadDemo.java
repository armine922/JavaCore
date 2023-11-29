package classwork.chapter11;

public class ThreadDemo {
    public static void main(String[] args) {
        new NewThread();
        try {
            for (int n = 5; n > 0; n--) {
                System.out.println(n);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Main stream is stopped");
        }
        System.out.println("Main stream is finished");
    }
}
