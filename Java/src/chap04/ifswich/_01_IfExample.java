package chap04.ifswich;

public class _01_IfExample {
    public static void main(String[] args) {
        // 조건문 if
        int age = 10;

        //if문 내에서 하나의 문장을 실핼할 때에는 중괄호를 생략해도된다.
        //가독성을 위해서 if for 반복문에서도 습관적으로 중괄호를 쓰는 습관을 들여야한다
        if(age >= 8)
            System.out.println("학교에 다닙니다.");
        System.out.println("------------------------------------------------");
        if(age >= 8)
            System.out.println("학교에 다닙니다.");
            System.out.println("즐거운 학교 생활을 하세요!");
        System.out.println("------------------------------------------------");
        if(age >= 8) {
            System.out.println("학교에 다닙니다.");
            System.out.println("즐거운 학교 생활을 하세요!");
        }
        System.out.println("그럼 안녕~");

    }
}
