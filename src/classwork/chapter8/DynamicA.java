package classwork.chapter8;

public class DynamicA {
    void callme() {
        System.out.println("In call me method() from A");
    }
}

class Bbb extends DynamicA {
    void callme() {
        System.out.println("In call me method() from B");
    }
}

class Cc extends DynamicA {
    void callme() {
        System.out.println("In call me method() from C");
    }
}