package chap04.ifswich;

public class _04_IfExample {
    public static void main(String[] args) {
        //나이에 따른 입장료
        //else문은 조건을 순서대로 검사하며 차음으로 참인 조건의 코드만 실행한 후 if-else문을 종료
        //각 if문은 서로 연결되어 있지 않으므로 모든 조건을 순서댈로 검사한다
        int age = 9;
        int change;

        if (age < 8) {
            change = 1000;
            System.out.println("취학 전 아동입니다");
        }
        if (age < 14) {
            change = 2000;
            System.out.println("초등학생입니다");
        }
        if (age < 20) {
            change = 2500;
            System.out.println("중,고등학생입니다");
        }else {
            change = 3000;
            System.out.println("일반인입니다");
        }
        System.out.println("입장료는" + change + "원 입니다");

    }
}
