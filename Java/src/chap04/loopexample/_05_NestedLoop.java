package chap04.loopexample;

public class _05_NestedLoop {
    public static void main(String[] args) {
        int dan;
        int times;
        /*for (dan = 2; dan <=9;dan++)
        {
            for(times = 1;times <= 9 ; times++)
            {
                System.out.println(dan + "x" + times + "=" + dan*times);
            }
        }*/
        for (int i = 2; i <=9; i++)
        {
            for(int j = 1;j <= 9 ; j++)
            {
                System.out.println(i + "x" + j + "=" + i*j);
            }
            System.out.println();
        }
    }
}
