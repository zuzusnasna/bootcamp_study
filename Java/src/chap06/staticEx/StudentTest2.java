package chap06.staticEx;

public class StudentTest2 {
    public static void main(String[] args) {

        Student1 studentLee = new Student1();
        studentLee.studentName = "이코사";
        System.out.println(studentLee.studentName + "학번 " + studentLee.studentID);

        Student1 studentSon = new Student1();
        studentSon.studentName = "손코사";
        System.out.println(studentSon.studentName + "학번 " + studentSon.studentID);

        System.out.println(studentLee.serialNum);
        System.out.println(studentSon.serialNum);

        //결국 두 인스턴스가 공유되고 있다.
        //이 값을 쓰면 모든 학생의 번호가 같다.

    }
}
