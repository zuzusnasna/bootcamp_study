package chap03;

public class _03_OperationEx3 {
    public static void main(String[] args) {
        //논리 연산자
        int num1 = 100;
        int i = 2;

        //and 연산
        //i 가 2인 이유는 좌측부터 논리가 참인지 거짓인지 순차적으로 진행되는데
        //이미 좌측 구절에서 거짓이 나와 우측 구절은 아예 탑색이 이루어지지 않음
        // 이를 ""단락 회로 평가""라고 한다
        boolean value = ((num1 = num1 + 10) < 10) && ((i = i + 2) < 10);
        System.out.println(value);
        System.out.println(num1);
        System.out.println(i);

        //or 연산
        boolean value1 = ((num1 = num1 + 10) < 10) || ((i = i + 2) < 10);
        System.out.println(value1);
        System.out.println(num1);
        System.out.println(i);

        //not 연산
        System.out.println(!true);
        System.out.println(!false);
        System.out.println(!(5==5));
        System.out.println(!(3==5));


    }
}
