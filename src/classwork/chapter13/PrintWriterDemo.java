package classwork.chapter13;
import java.io.*;

public class PrintWriterDemo {
    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out,true);
        pw.println("This line");
        int i=-7;
        pw.println(i);
        double d=4.5e-7;
        pw.println(d);
    }
}
