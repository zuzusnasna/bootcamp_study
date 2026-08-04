package chap05.reference;

public class Student3 {

 /*   5. Student3
    학생이 과목 객체를 참조하는 구조이다.
    즉, 학생 안에 국어와 수학 객체를 포함한다.
    이를 Has-A 관계라고 한다.*/

    int studentID;
    String studentName;

    Subject korean; //-------------- 참조 자료형
    Subject math;   //--------------- 참조 자료형
}
