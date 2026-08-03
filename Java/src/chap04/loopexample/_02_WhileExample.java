package chap04.loopexample;

public class _02_WhileExample {
    public static void main(String[] args) {
        int num = 1;
        int sum = 0;

        while (num <= 10){
            sum += num;
            System.out.println(num +"번째 - num = " + num + " 합 : " + sum);
            num++;
        }
        System.out.println(sum);
    }
}
