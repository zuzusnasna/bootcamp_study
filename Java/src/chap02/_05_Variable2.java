package chap02;

public class _05_Variable2 {
    public static void main(String[] args) {
        //학생정보
        String name = "김자바";
        int hour = 10;

        System.out.println(name + "님의 주문은 " + hour + "시에 시작됩니다.");
        System.out.println(name + "님이 자바 수업에 출석하셨습니다.");
        System.out.println(name + "님이 퇴실하셨습니다.");

        //성적 정보
        double score = 95.5;
        char grade = 'A';
        name = "이코사";
        System.out.println(name + "님의 자바 시험 평균 점수는 " + score + " 점입니다");

        //합격 여부
        boolean pass = true;
        System.out.println("자바 과정을 수료했을까요? " + pass);
        boolean isMarried = true;
        System.out.println("결혼 여부 : " + isMarried);

        //실수형
        double d = 3.1415929581; //정밀한 수를 다룰 경우 double을 사용
        float f = 3.1215929581F; //float 식별자 F or l 기입 필
        System.out.println(d);
        System.out.println(f);

        //정수형 변수
        long l = 1000000000000L;
        long l2 = 1000_000_000_000L;
        System.out.println(l);
        System.out.println(l2);

        //자료형 예시
        //int : 정수, long : 큰 정수, float : 실수(정밀도 낮음), double : 실수 (정밀도 높음)
        //char : 문자 1개, string : 문자열, boolean : true or false
    }
}
