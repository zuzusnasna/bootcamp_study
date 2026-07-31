package chap03;

public class _01_OperationEx1 {
    public static void main(String[] args) {
        //대입연산자
        int mathscore = 90;
        int engscore = 70;
        int totalscore = mathscore + engscore;
        System.out.println(totalscore);

        double avgScore = totalscore / 2.0;
        System.out.println(avgScore);

        //%(나머지) 연산자
        int num = 10;
        int quotient = num / 3;
        int remainder = num % 3;
        System.out.println(quotient); //몫
        System.out.println(remainder); //나머지

        //부호연산자
        int num1 = 10;
        int num2 = -num1;
        System.out.println(num1);
        System.out.println(num2);

        num = 10;
        num = -num;
        System.out.println(num);

        num = 10;
        num = num + 2;
        num += 2;
        System.out.println(num);

        //num = num - 2;
        num = 10;
        num -= 2;
        System.out.println(num);

        //num = num * 2
        num = 10;
        num *= 2;
        System.out.println(num);

        //num = num / 2
        num /= 2;
        System.out.println(num);

        //num = num % 2
        num %= 2;
        System.out.println(num);
    }
}
