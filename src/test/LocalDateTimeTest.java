package test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @ClassName LocalDateTimeTest
 * @Description TODO
 * @Author WhatsUpeng!!!
 * @Date 8/4/23 5:15 PM
 * @Version 1.0
 **/
public class LocalDateTimeTest {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        String nowStr = now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        System.out.println(nowStr);
    }
}
