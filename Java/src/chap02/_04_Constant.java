package chap02;

public class _04_Constant {
    public static void main(String[] args) {
        //상수(변하지 않는 값) 선언은 final로
        final int MAX_NUM = 100;
        final int MIN_NUM;
        MIN_NUM = 0;
        System.out.println(MAX_NUM);
        System.out.println(MIN_NUM);

        final int STUDENT_NUM = 30;
        System.out.println(STUDENT_NUM);

        final  String KR_COUNTRY_CODE = "+82"; // 국가코드
        System.out.println(KR_COUNTRY_CODE);


    }
}
