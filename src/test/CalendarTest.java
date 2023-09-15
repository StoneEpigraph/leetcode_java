package test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @ClassName CalendarTest
 * @Description TODO
 * @Author WhatsUpeng!!!
 * @Date 8/2/23 10:58 AM
 * @Version 1.0
 **/
public class CalendarTest {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        cal.set(2023, Calendar.JANUARY, 1);
        int i = cal.get(Calendar.MONTH);
        System.out.println(cal.get(Calendar.DAY_OF_MONTH));
        System.out.println(i);
        Date time = cal.getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf.format(time));
    }
}
