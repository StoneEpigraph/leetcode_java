package test;

import java.util.*;

/**
 * @ClassName MapTest
 * @Description TODO
 * @Author StoneEpigraph
 * @Date 3/10/22 4:32 PM
 * @Version 1.0
 **/
public class MapTest {
    public static void main(String[] args) {
        TreeMap<String, Object> map = new TreeMap<>();
        map.put("version", 1.0);
        map.put("timestamp", new Date().getTime());
        map.put("token", UUID.randomUUID());
        map.put("data", "1231231231");

        map.forEach( (key, value) -> {
            System.out.println(key + ": " + value);
        });
    }
}
