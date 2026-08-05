package quiz._04_Quiz_Chap04;

public class _04_Quiz_Chap04_4 {
    public static void main(String[] args) {
        //2. while문을 사용하여 1부터 20까지의 짝수의 합을 구하는 프로그램을 작성하세요
        int i = 0;
        int sum = 0;
        while (i <= 20) {
            if (i % 2 == 0)
            {
                sum += i;
            }
            i++;
        }
        System.out.println(sum);
    }
}
