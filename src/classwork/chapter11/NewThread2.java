package classwork.chapter11;

public class NewThread2 extends Thread {
    NewThread2() {
        super();
        System.out.println(this);
        start();
    }

    public void run() {

        try {
            for (int n = 6; n > 0; n--) {
                System.out.println(n);
                Thread.sleep(500);
                System.out.println("Child stream is stopped");
            }
        } catch (InterruptedException e) {
            System.out.println("child stream is finished");

        }
    }
}
