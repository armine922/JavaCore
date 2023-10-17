package homework.medicalCentre;

import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;

public class DateUtil {
    public static final SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");

    public static Date stringToDate(String datestr) throws ParseException {
        return sdf.parse(datestr);
    }

    public static String dateToString(Date date) {
        return sdf.format(date);
    }

}
