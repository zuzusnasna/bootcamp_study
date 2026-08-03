package quiz;

public class _04_Quiz_Chap04_2 {
    public static void main(String[] args) {
        //switch-case문을 사용하여 다음과 같이 출력하는 프로그램을 작성하세요
        //1:아메리카노를 선택했습니다
        //2:카페라떼를 선택했습니다
        //3:카푸치노를 선택했습니다.
        //그외 :없는 메뉴입니다
        //각 case마다 break를 사용하시오

        int menu = 2;
        switch (menu) {
            case 1:
                System.out.println("아메리카노를 선택했습니다.");
                break;
            case 2:
                System.out.println("카페라떼를 선택했습니다.");
                break;
            case 3:
                System.out.println("카푸치노를 선택했습니다.");
                break;
            default:
                System.out.println("없는 메뉴입니다.");
        }
    }
}
