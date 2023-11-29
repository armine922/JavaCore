package classwork.chapter11;

public class ExtendThread {
    public static void main(String[] args) {
        new NewThread2();
        try {
            for (int n = 6; n > 0; n--) {
                System.out.println(n);
                Thread.sleep(1000);
                System.out.println("Main stream is stopped");
            }
        } catch (InterruptedException e) {
            System.out.println("Main stream is finished");

        }
    }
}
