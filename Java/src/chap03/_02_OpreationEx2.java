package chap03;

public class _02_OpreationEx2 {
    public static void main(String[] args) {
        //증감 연산자
        int gamescore = 150;
        System.out.println(gamescore);
        System.out.println(++gamescore); //이 문장이 끈나기 전 증가
        System.out.println(gamescore);

        gamescore = 150;
        System.out.println(gamescore);
        System.out.println(gamescore++);//이 문장이 끝나고 증가
        System.out.println(gamescore);

        System.out.println("--------------------------------------------");

        gamescore = 150;
        System.out.println(gamescore);
        System.out.println(--gamescore);
        System.out.println(gamescore);

        gamescore = 150;
        System.out.println(gamescore);
        System.out.println(gamescore--);
        System.out.println(gamescore);

        System.out.println("---------------------------------------------");

        //식장 대기 번호
        int waiting = 0;
        System.out.println("대기 인원 : " + waiting++); //대기인원 0
        System.out.println("대기 인원 : " + waiting++); //대기인원 1
        System.out.println("대기 인원 : " + waiting++); //대기인원 2
        System.out.println("대기 인원 : " + waiting); //대기인원 3

        //관계 연산자
        System.out.println(3 > 5);
        System.out.println(3 < 5);
        int num3 = 10;
        int num4 = 4;
        boolean flag = (num3 >= num4);
        System.out.println(flag);



    }
}
