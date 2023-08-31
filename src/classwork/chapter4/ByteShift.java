package classwork.chapter4;

public class ByteShift {
    public static void main(String[] args) {
        byte a = 64, b;
        int i;
        i = a << 2;
        b = (byte) (a << 2);
        System.out.println(" The initial meaning of a:" + a);
        System.out.println("i and b: " + i + " " + b);
    }
}
