package classwork;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;
public class DateChange {
    static Scanner scanner= new Scanner(System.in);
    static SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
    public static void main(String[] args) throws ParseException {

        System.out.println("Please input birthday date dd/mm/yy.");
        String birthdayStr = scanner.nextLine();
        Date date=sdf.parse(birthdayStr);
        System.out.println(date);
    }
}
