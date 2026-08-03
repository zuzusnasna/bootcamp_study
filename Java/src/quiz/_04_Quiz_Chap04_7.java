package quiz;

public class _04_Quiz_Chap04_7 {
    public static void main(String[] args) {
        //누적합이 200을 넘는 최종합계와 마지막 숫자(for문)
        int i;
        int sum = 0;
        for(i = 1; ; i++)
        {
            sum += i;
            if(sum >= 200)
                break;
        }
        System.out.println(sum);
    }
}
