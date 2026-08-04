package chap05.classpart;

public class StudentTest1 {
    public static void main(String[] args) {
        Student studentAhn = new Student();
        studentAhn.studentName = "안연수";
        studentAhn.address = "서울시 송파구 중대로";

        System.out.println(studentAhn.getStudentName());
        System.out.println(studentAhn.getAddress());
    }
}
