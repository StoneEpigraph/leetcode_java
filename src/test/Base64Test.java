package test;

import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import lombok.extern.slf4j.Slf4j;

import java.util.Base64;

/**
 * @ClassName Base64Test
 * @Description TODO
 * @Author WhatsUpeng!!!
 * @Date 8/15/23 12:19 PM
 * @Version 1.0
 **/
public class Base64Test {

    private static Logger logger = LoggerFactory.getLogger(Base64Test.class);

    public static void main(String[] args) {
        byte[] bytes = new byte[]{0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09};
        String directionEncode = Base64.getEncoder().encodeToString(bytes);
        logger.error("原字节码内容：");
        printBytes(bytes);
        logger.error("字节码直接进行Base64编码结果：" + String.valueOf(directionEncode));

        // 转16进制字符串
        StringBuilder hexString = new StringBuilder();
        for (byte b : bytes) {
            String hex = Integer.toHexString(b & 0xFF);
            if (hex.length() == 1) {
                hexString.append('0');
            }
            hexString.append(hex);
        }

//        logger.error("字节码转16进制后的内容：" + String.valueOf(bytes));
        logger.error("字节码转16进制后的内容：");
        printBytes(hexString.toString().getBytes());
        String relativeEncode = Base64.getEncoder().encodeToString(hexString.toString().getBytes());
        logger.error("字节数据16进制后再获取字节码进行Base64编码结果： " + relativeEncode);
    }

    public static void printBytes(byte[] bytes) {
        if (bytes == null) {
            return;
        }
        for (byte b : bytes) {
            String hex = Integer.toHexString(b & 0xFF);
            System.out.print(hex + " ");
        }
    }
}
