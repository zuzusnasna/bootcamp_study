package chap11._02_String;

public class _01_StringTest1 {
    public static void main(String[] args) {
        String str1 = new String("abc");
        String str2 = new String("abc");;

        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));

        String str3 = "test";
        String str4 = "test";

        System.out.println(str3 == str4);
        System.out.println(str3.equals(str4));
    }
}
