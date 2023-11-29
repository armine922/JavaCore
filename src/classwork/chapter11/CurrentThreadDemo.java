package classwork.chapter11;

public class CurrentThreadDemo {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        t.setName("My thread");
        System.out.println(t);
        try {
            for (int n = 5; n > 0; n--) {
                Thread.sleep(1000);
                System.out.println(n);
            }

        } catch (InterruptedException e) {
            System.out.println("The main sream is caught");
        }
    }
}
