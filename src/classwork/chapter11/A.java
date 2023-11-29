package classwork.chapter11;

public class A {
    synchronized void foo(B b) {
        String name = Thread.currentThread().getName();
        System.out.println(name + " is in method foo()");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("A class is inmterrupted");
        }
        System.out.println(name + "Try to call method B.Last");
        b.last();
    }

    synchronized void last() {
        System.out.println("B in method A.last()");
    }
}

class B {
    synchronized void bar(A a) {
        String name = Thread.currentThread().getName();
        System.out.println("Name is included in method B.bar()");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("B class is interrupted");
        }
        System.out.println(name + " tries to call method A.last");
        a.last();
    }

    synchronized void last() {
        System.out.println("In method A.last()");
    }
}

class DeadLock implements Runnable {
    A a = new A();
    B b = new B();

    DeadLock() {
        Thread.currentThread().setName("Main stream");
        Thread t = new Thread(this, "Opposite stream");
        t.start();
        a.foo(b);
        System.out.println("Back to main stream.");
    }

    public void run() {
        b.bar(a);
        System.out.println("Back to another stream");
    }

    public static void main(String[] args) {
        new DeadLock();
    }
}