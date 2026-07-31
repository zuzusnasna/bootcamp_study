package chap03;

public class _04_OperationEx4 {
    public static void main(String[] args) {
        //삼항 연산자 (조건식) ? a : b
        //조건식이 참이면 a를 , 거짓이면 b를 출력
        int fatherAge = 45;
        int motherAge = 49;

        char ch;
        ch = (fatherAge > motherAge) ? 'T' : 'F';
        System.out.println(ch);
    }
}
