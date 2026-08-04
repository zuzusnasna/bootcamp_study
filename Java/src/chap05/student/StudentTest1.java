package chap05.student;

public class StudentTest1 {
    public static void main(String[] args) {

        Student studentAhn = new Student();
        studentAhn.studentName = "안연수";
        studentAhn.address = "서울시 송파구 중대로";

        System.out.println(studentAhn.getStudentName());
        System.out.println(studentAhn.getAddress());

        Student studentLee  = new Student();
        studentLee.studentName = "이순신";
        studentLee.address = "서울시 서초구 방배동";

        System.out.println(studentLee.getStudentName());
        System.out.println(studentLee.getAddress());
    }
}
