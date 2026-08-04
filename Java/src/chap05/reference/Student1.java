package chap05.reference;

public class Student1 {

/*    1. 참조 자료형이란?
    참조 자료형은 객체의 주소(참조값)를 저장하는 자료형이다.

    기본 자료형: 실제 값을 저장 (int, double, char 등)
    참조 자료형: 객체를 참조 (String, 사용자 정의 클래스 등)*/

/*    2. Student1
    학생의 점수만 저장하는 클래스이다.

    단점
    과목 정보가 없어 관리하기 어렵다.
    과목이 추가될 때마다 변수를 계속 늘려야 한다.*/

    int studentID;
    String studentName;
    int koreaScore;
    int mathScore;
}
