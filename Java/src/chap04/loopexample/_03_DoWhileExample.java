package chap04.loopexample;

public class _03_DoWhileExample {
    public static void main(String[] args) {
        int num = 1;
        int sum = 0;
        //do while문은 수행문을 실행 하고 나중에 조건을 검사
        //텃 반복의 조건이 거짓이더라고 최소 1번은 수행함
        //for , while 문이 많이 사용되고
        //do while문은 상대적으로 사용빈도가 낮음
        do {
            sum += num;
            num++;
        }while (num <=10);
        System.out.println("1부터 10까지의 합은 " + sum + " 입니다");
    }
}
