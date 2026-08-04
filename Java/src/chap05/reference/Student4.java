package chap05.reference;

public class Student4 {

/*    6. Student4
    생성자를 이용해 학생 객체를 만들면서 국어와 수학 객체도 함께 생성한다.
    또한 메서드를 통해 과목명과 점수를 저장하고 학생 정보를 출력한다.*/

    int studentID;
    String studentName;

    Subject2 korean; //-------------- 참조 자료형
    Subject2 math;   //--------------- 참조 자료형

    public Student4(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;

        korean = new Subject2();
        math = new Subject2();
    }

    public void showStudentInfo() {
        System.out.println(studentName + "님의 " +
                korean.getSubjectName() + "과목 점수는 " +
                korean.getScorePoint() + "점이며 " +
                math.getSubjectName() + "과목 점수는 " +
                math.getScorePoint() + "점입니다.");
    }
    public  void  setKoreanSubject(String subjectName, int score){
        korean.setSubjectName(subjectName);
        korean.setScorePoint(score);
    }
    public  void  setMathSubject(String subjectName, int score){
        math.setSubjectName(subjectName);
        math.setScorePoint(score);
    }
}
