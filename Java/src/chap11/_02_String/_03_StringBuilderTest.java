package chap11._02_String;

public class _03_StringBuilderTest {
    public static void main(String[] args) {
        String javaStr = new String("Java");
        System.out.println("javaStr 문자열 주소 : " + System.identityHashCode(javaStr));

        StringBuilder buffer = new StringBuilder(javaStr);
        System.out.println("연산 전 buffer 메모리 주소 : " + System.identityHashCode(buffer));

        // append 메서드가 실행 될 때마다 메모리가 새로 생성되는 것이 아니라
        //하나의 메모리에 계속 연결된다.
        buffer.append("     and");
        buffer.append("     android");
        buffer.append("     programming is fun!!");
        System.out.println("연산 후 buffer 메모리 주소 : " + System.identityHashCode(buffer));


        javaStr = buffer.toString();
        System.out.println(javaStr);
        System.out.println("새로 만들어진 javaStr 문자열 주소 : " + System.identityHashCode(javaStr));
    }
}
