package Moudule1;

/**
 * @author XuKaiKai
 * @date 2019/9/19 21:20
 * 1.== 和 equals 的区别是什么？
 * 2.两个对象的 hashCode()相同，则 equals()也一定为 true，对吗？
 */

public class TestEquals {
    public static void main(String[] args) {
        //==============1=================
        String s1 = "你好";
        String s2 = "你好";
        String s3 = new String("你好");
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        Cat cat1 = new Cat("张三");
        Cat cat2 = new Cat("张三");
        System.out.println(cat1==cat2);
        System.out.println(cat1.equals(cat2));

        //=========2==============
        String s4 = "通话";
        String s5 = "重地";
        System.out.println(String.format("s4:%d|s5:%d",s4.hashCode(),s5.hashCode()));
        System.out.println(s4.equals(s5));  //hashcode相同,但是并不equals


    }
}

