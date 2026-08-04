package chap05.reference;

public class StudentTest {
    public static void main(String[] args) {
        Student4 studentLee = new Student4(100,"Lee");
        studentLee.setKoreanSubject("국어", 88);
        studentLee.setMathSubject("수학", 90);

        Student4 studentKim = new Student4(102,"Kim");
        studentKim.setKoreanSubject("국어", 100);
        studentKim.setMathSubject("수학", 96);

        studentLee.showStudentInfo();
        studentKim.showStudentInfo();
    }
}
