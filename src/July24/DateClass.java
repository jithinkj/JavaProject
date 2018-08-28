package July24;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateClass {
    public static void main(String[] args) {
        Date today =new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd");
        System.out.println(today);
        System.out.println(sdf.format(today));

        LocalDate localDate =LocalDate.now();
        System.out.println(localDate);
        LocalTime time=LocalTime.now();
        System.out.println(time);

        GregorianCalendar cal=new GregorianCalendar();
        int year=cal.get(Calendar.YEAR);
        System.out.println(year);
        System.out.println(cal.getTime());
    }


}
