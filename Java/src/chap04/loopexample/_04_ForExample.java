package chap04.loopexample;

public class _04_ForExample {
    public static void main(String[] args) {
        int i;
        int sum = 0;
        for (i = 0; i <= 10; i++)
        {
            sum += i;
        }
        System.out.println("1부터 10까지의 합은 " + sum + " 입니다");
    }
}
