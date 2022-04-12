package test;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName TestDate
 * @Description TODO
 * @Author StoneEpigraph
 * @Date 2021/11/29 下午5:05
 * @Version 1.0
 **/
public class TestDate {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateStr = sdf.format(date);
        System.out.println(dateStr);
    }
}
