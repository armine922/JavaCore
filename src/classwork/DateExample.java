package classwork;
import java.text.SimpleDateFormat;
import java.util.Date;
public class DateExample {
    public static void main(String[] args) {
    Date date = new Date();
    SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yy hh.mm");
        System.out.println(sdf.format(date));
}
}