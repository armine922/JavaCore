package classwork.chapter11;

public class NewThread3 implements Runnable {

    Thread t;
    String name;

    NewThread3(String threadname) {
        name = threadname;
        t = new Thread(this, name);
        System.out.println(t);
        t.start();


    }

    public void run() {
        try {
            for (int n = 5; n > 0; n--) {
                System.out.println(n);
                Thread.sleep(1000);

            }
        } catch (InterruptedException e) {
            System.out.println("Name is stopped");

        }
        System.out.println("Name stream is finished");

    }
}
