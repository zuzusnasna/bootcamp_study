package chap11._01_object;

import chap06.staticEx.Student;

public class _02_StringEquals {
    public static void main(String[] args) {
        String str1 = new String("abc");
        String str2 = new String("abc");;

        String str3 = "test";
        String str4 = "test";

        System.out.println(str1 == str2); //힙메모리 주솟 값이 같은지
        System.out.println(str1.equals(str2)); // 문자열이 같은지 비교

        System.out.println(str3 == str4);
        System.out.println(str3.equals(str4));
        //이미 재정의가 되어있음
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
    }
}
