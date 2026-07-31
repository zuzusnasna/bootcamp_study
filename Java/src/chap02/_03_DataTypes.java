package chap02;

public class _03_DataTypes {
    public static void main(String[] args) {
        int a = 100;
        /*int num1 = 1234567800;*/ // int 범위 넘어감 오류
        //자바는 기본적으로 모든 정수 int형을 기본으로 처리
        //long형으로 처리하라고 컴파일러에게 알려주어야 함
        //숫자 뒤에 l 이나 L을 입역하여야 함
        long num2 = 12345678900L;
        long num3 = 1000; //int 형이 long형으로 자동 변환됨
        double b = 10.5; //실수형
        double dnum = 3.14;
        float fnum = 3.14F;

        boolean c = true; //불리언 값 TRUE or FALSE만을 출력
        char d = 'A';
        String e = "Hello Java";


        System.out.println(a);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(b);
        System.out.println(dnum);
        System.out.println(fnum);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
    }
}
