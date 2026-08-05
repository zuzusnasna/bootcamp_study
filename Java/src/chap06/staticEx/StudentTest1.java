package chap06.staticEx;

public class StudentTest1 {
    public static void main(String[] args) {
        Student studentLee = new Student();
        studentLee.studentName = "이코사";
        studentLee.serialNum++;

        Student studentSon = new Student();
        studentSon.studentName = "손코사";

        System.out.println(studentLee.serialNum);
        System.out.println(studentSon.serialNum);

        //결국 두 인스턴스가 공유되고 있다.
        //이 값을 쓰면 모든 학생의 번호가 같다.

    }
}
