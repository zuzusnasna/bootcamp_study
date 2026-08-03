package chap04.loopexample;

public class _06_ContinueExample {
    public static void main(String[] args) {
        int total = 0;
        for(int i = 0; i <= 100 ; i++)
        {
            if(i % 2 ==0)
                continue;
            total += i;
        }
        System.out.println(total);
    }
}
