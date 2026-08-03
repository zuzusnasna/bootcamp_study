package chap04.loopexample;

public class _05_NestedLoop {
    public static void main(String[] args) {
        int dan;
        int times;
        for (dan = 2; dan <=9;dan++)
        {
            for(times = 1;times <= 9 ; times++)
            {
                System.out.println(dan + "x" + times + "=" + dan*times);
            }
        }
    }
}
