package quiz;

public class _04_Quiz_Chap04_3 {
    public static void main(String[] args) {
        //1. for문을 사용하여 1부터 20까지의 짝수의 합을 구하는 프로그램을 작성하세요
        int i;
        int sum = 0;
        for (i = 0; i <= 20 ; i++)
        {
            if(i % 2 == 0)
            {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
