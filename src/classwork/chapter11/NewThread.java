package classwork.chapter11;

public class NewThread implements Runnable {
    Thread t;

    NewThread() {
        t = new Thread(this, "Demonstartion stream");
        System.out.println(t);
        t.start();
    }

    @Override
    public void run() {
        try {
            for (int n = 5; n > 0; n--) {
                System.out.println(n);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Child stream is stopped");
        }
        System.out.println("Child stream is finished");
    }
}
