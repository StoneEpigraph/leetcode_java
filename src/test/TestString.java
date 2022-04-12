package test;

/**
 * @ClassName TestString
 * @Description TODO
 * @Author StoneEpigraph
 * @Date 2021/12/31 下午3:56
 * @Version 1.0
 **/
public class TestString {
    public static void main(String[] args) {
        String fileName = "asfasd+asdfasd_asdfasd.pdf";
        System.out.println(fileName.substring(fileName.lastIndexOf(".") + 1));
    }
}
