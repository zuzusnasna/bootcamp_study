package quiz;

public class _04_Quiz_Chap04_1 {
    public static void main(String[] args) {
        //1. if-else
        // if else문을 사용하여 다음 조건에따라 등급을 출력하는 프로그램을 작성하세요
        //90점이상:A학점입니다
        //80점이상:B학점입니다
        //70점이상:C학점입니다
        //70점미만:재시험 대상입니다

        int score = 85;
        System.out.println("점수는 " + score + "점 입니다");
        if (score >= 90)
        {
            System.out.println("A학점 입니다.");
        }
        else if (score >= 80)
        {
            System.out.println("B학점 입니다.");
        }
        else if (score >= 70)
        {
            System.out.println("C학점 입니다.");
        }
        else
            System.out.println("재시험 대상입니다.");
    }
}
