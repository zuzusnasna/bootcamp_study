package chap07.arrayList.student;

import java.util.ArrayList;

public class Student {
    int studentID;
    String studentName;
    /*int subjectCount = 0;*/
    ArrayList<Subject> subjectList;

    public Student(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
        subjectList = new ArrayList<>();
    }
   public void addSubject(String name, int score){
        Subject subject = new Subject();
        subject.setName(name);
        subject.setScorePoint(score);
        subjectList.add(subject);
        /*subjectCount++;*/
   }

    public void showStudentInfo() {
        int total = 0;
        for (Subject s : subjectList) {
            total += s.getScorePoint();
            System.out.println("학생 " + studentName + "의 " +
                    s.getName() + " 과목 성적은 " + s.getScorePoint() + " 입니다.");
        }
        double avg = (double) total / subjectList.size();
        System.out.println("학생 " + studentName + "의 총점은 " + total + " 입니다.");
        System.out.println("평균 : " + avg);
    }
}
