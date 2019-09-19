package Moudule1;

/**
 * @author XuKaiKai
 * @date 2019/9/19 21:51
 * 1.StringBuffer和StringBuilder不同
 * 2.如何实现字符串反转
 *
 */

public class TestStringBuilderOrBuffer {
    public static void main(String[] args) {
        String s = "abcdefg";
        System.out.println(new StringBuffer(s).reverse().toString());
    }
}
