package chap05.reference;

public class Student2 {
    /*
    3. Student2
    점수와 함께 과목명도 저장하도록 개선한 클래스이다.

    단점
    과목마다 변수와 코드가 반복된다.
    과목이 많아질수록 관리가 어려워진다.*/

    int studentID;
    String studentName;
    int koreaScore;
    int mathScore;

    String koreaSubject;
    String mathSubject;
}
