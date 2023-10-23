package classwork.chapter10;

public class ThrowDemo {
    static void demoproc() {
        try {
            throw new NullPointerException("Demonstration");

        } catch (NullPointerException e) {
            System.out.println("Exception handled in method demoproc");
            throw e;
        }
    }

    public static void main(String[] args) {
        try {
            demoproc();
        } catch (NullPointerException e) {
            System.out.println(e);
        }
    }
}
