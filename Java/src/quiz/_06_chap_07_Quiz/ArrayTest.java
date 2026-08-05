package quiz._06_chap_07_Quiz;

public class ArrayTest {
    public static void main(String[] args) {
        //1. 학생 5명의 점수를 저장할수있는 int현 배열 생성,
        //for문을 이용해 출력
        int[] score = new int[]{80,90,75,100,85};
        for (int i = 0; i < score.length; i++) {
            System.out.println(score[i]);
        }
        System.out.println("--------------------------------------------------------------------");

        //2. 다음 정수배열에서 30이상인 값만 출력해보세요
        int[] data = {10,40,20,50,30};
        for (int i = 0; i < data.length; i++) {
            if(data[i] >= 30)
            {
                System.out.println(data[i]);
            }
        }
        System.out.println("--------------------------------------------------------------------");

        //3. 2.의 배열에 저장된 모든 숫자의 합계를 구하세요
        int sum = 0;
        for (int i = 0; i <data.length; i++) {
            sum += data[i];
        }
        System.out.println(sum);
    }
}
