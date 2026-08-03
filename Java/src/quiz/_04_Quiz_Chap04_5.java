package quiz;

public class _04_Quiz_Chap04_5 {
    public static void main(String[] args) {
        //for문을 사용하여 5의 배수 제외 출력
        //합계도 출력
        int total = 0;
        for(int i = 1; i <= 20; i++)
        {
            if(i % 5 == 0)
                continue;
            total += i;
            System.out.println(i);
        }
        System.out.println(total);
    }
}
