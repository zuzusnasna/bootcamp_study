package quiz._04_Quiz_Chap04;

public class _04_Quiz_Chap04_8 {
    public static void main(String[] args) {
        //누적합이 200을 넘는 최종합계와 마지막 숫자(while문)
            int i = 1;
            int sum = 0;
            while (true)
            {
                sum += i;
                if(sum >= 200)
                    break;
                i++;
                System.out.println(i);
            }
            System.out.println(sum);
    }
}
