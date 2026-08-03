package chap04.ifswich;

public class _05_SwitchCase {
    public static void main(String[] args) {
        //switch문은 하나의 값에 여러경우(case)중 하나를 선택하여 실행
        //값이 간당한 정수, 문자, 문자열 등을 비교 할 때 if-else보다 코드가 간결하게 작성할 스 있다
        //break는 현재 case 싱행을 종료하고 switch문을 빠져나간다
        //switch문 전체에서 중괄호는 한번만 사용하여야 한다
        int ranking = 1;
        char medalcolor;

        switch (ranking){
            //랭킹이 1
            case 1: medalcolor = 'g';
            //break;
            case 2: medalcolor = 's';
            break;
            case 3: medalcolor = 'b';
            break;
            default:
            medalcolor = 'A';
        }
        System.out.println(ranking + "등의 메댈 색은? " + medalcolor + " 입니다");
    }
}
