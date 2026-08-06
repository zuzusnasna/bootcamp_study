package chap07.arrayList.student;

public class ScoreTest {
    public static void main(String[] args) {
        Student student1 = new Student(1001, "one");
        student1.addSubject("국어", 100);
        student1.addSubject("수학", 70);

        Student student2 = new Student(1002, "two");
        student2.addSubject("국어", 100);
        student2.addSubject("수학", 70);
        student2.addSubject("영어", 90);

        student1.showStudentInfo();
        System.out.println("========================================");
        student2.showStudentInfo();

    }
}
