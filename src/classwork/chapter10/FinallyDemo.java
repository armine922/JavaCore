package classwork.chapter10;

public class FinallyDemo {
    static void procA() {
        try {
            System.out.println("In method proca");
            throw new RuntimeException("Demonstration");
        } finally {
            System.out.println("Finally in method procA");

        }
    }

    static void procB() {
        try {
            System.out.println("In method procB");
            return;
        } finally {
            System.out.println("Finally in method procaB");
        }
    }

    static void procC() {
        try {
            System.out.println("In method procC");
        } finally {
            System.out.println("Finally in method procC");
        }
    }

    public static void main(String[] args) {
        try {
            procA();
        } catch (Exception e) {
        }
        procB();
        procC();
    }
}
