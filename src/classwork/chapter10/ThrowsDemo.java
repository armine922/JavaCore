package classwork.chapter10;

public class ThrowsDemo {
    static void throwOne() throws IllegalAccessException {
        System.out.println("In method throwOne");
        throw new IllegalAccessException("Demonstartion");
    }

    public static void main(String[] args) {
        try {
            throwOne();
        } catch (IllegalAccessException e) {
            System.out.println(e);
        }
    }
}
