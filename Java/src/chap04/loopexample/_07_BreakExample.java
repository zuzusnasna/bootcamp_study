package chap04.loopexample;

public class _07_BreakExample {
    public static void main(String[] args) {
        //break문
        int sum = 0;
        int num;

        for(num = 0; ;num++)
        {
            sum += num;
            if(num >= 100)
                break;
        }
        System.out.println(sum);
    }
}
