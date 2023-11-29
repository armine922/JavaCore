package classwork.chapter11;

public class Q1 {
    int n;
    boolean valueSet = false;

    synchronized int get() {
        while (!valueSet)
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Interrupted exception is caught");
            }
        System.out.println("Recieved" + n);
        valueSet = false;
        notify();
        return n;
    }


    synchronized void put(int n) {
        while (valueSet)
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Interrupted exception is caught");

            }
        this.n = n;
        valueSet = true;
        System.out.println(n);
        notify();


    }
}

class Producer1 implements Runnable {
    Q1 q;

    Producer1(Q1 q) {
        this.q = q;
        new Thread(this, "Producer").start();
    }

    public void run() {
        int i = 0;
        while (true)

        {
            q.put(i++);


        }
    }
}

class Consumer1 implements Runnable {
    Q1 q;

    Consumer1(Q1 q) {
        this.q = q;
        new Thread(this, "Producer").start();
    }

    public void run() {
        while (true)

        {
            q.get();
        }

    }
}

class PCFixed {
    public static void main(String[] args) {
        Q1 q = new Q1();
        new Producer1(q);
        new Consumer1(q);
    }
}

