package chap02;

public class _06_TypeCasting {
    public static void main(String[] args) {
        //형 변환
        //정수형 -> 실수형 or 실수형 -> 정수형
        /*int score = 85 + 76.5;*/
        //연산 결과는 실수형인데 정수형으로 선언되어 오류 발생
        // int -> float or double
        int point = 85;
        System.out.println(point);
        System.out.println((float)point);
        System.out.println((double)point);
        System.out.println("---------------------------------------");

        //float or double to int
        float point_f = 87.5F;
        double point_d = 76.5;

        System.out.println(point_f);
        System.out.println((int)point_f);

        System.out.println(point_d);
        System.out.println((int)point_d);
        System.out.println("---------------------------------------");

        //정수 + 실수연산
        point = 85 + (int)76.5;
        System.out.println(point);

        point_d = (double)85 + 76.5;
        System.out.println(point_d);

        double changedPointDouble = point;
        System.out.println(changedPointDouble);
        //작은 범위에서 큰 범위로 갈 떄 자동 형변환
        //int -> long -> float -> double

        int changedpointInt = (int)point_d;
        System.out.println(changedpointInt);
        //큰 범위 데이터를 작은 범위로 넣으려고 하면 소수점 이하가 버려짐
        //이 경우 (int) 수동으로 형변환을 해야한다
        //double -> float -> long -> int
        System.out.println("---------------------------------------");

        //숫자를 문자열로
        String text1 = String.valueOf(85);
        System.out.println(text1);
        text1 = Integer.toString(85);
        System.out.println(text1);

        String text2 = String.valueOf(76.5);
        System.out.println(text2);
        text2 = Double.toString(76.5);
        System.out.println(text2);

        //문자열을 숫자로
        int number = Integer.parseInt("85");
        System.out.println(number);
        double decimal = Double.parseDouble(("76.5"));
        System.out.println(decimal);
        System.out.println(number + decimal);

        /*int error = Integer.parseInt("자바");*/
    }
}
