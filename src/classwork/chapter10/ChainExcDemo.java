package classwork.chapter10;

public class ChainExcDemo {
    static void demoproc() {
        NullPointerException e = new NullPointerException("Upper Level");
        e.initCause(new ArithmeticException("Cause"));
        throw e;
    }

    public static void main(String[] args) {
        try {
            demoproc();
        } catch (NullPointerException e) {
            System.out.println(e);
            System.out.println(e.getCause());
        }
    }
}
