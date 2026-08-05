package quiz._04_Quiz_Chap04;

public class _04_Quiz_Chap04_6 {
    public static void main(String[] args) {
        //for문을 사용해서 1~20까지의 수 출력
        //5,3의배수 제외
        //합계도 출력
        int total = 0;
        int i;
        for(i = 1; i <= 20; i++)
        {
            if(i % 3 == 0 || i % 5 == 0)
                continue;
            total += i;
            System.out.println(i);
        }
        System.out.println(total);
    }
}
