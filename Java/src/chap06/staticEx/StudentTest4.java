package chap06.staticEx;

public class StudentTest4 {
    public static void main(String[] args) {

        Student2 studentLee = new Student2();
        studentLee.studentName = "이코사";
        System.out.println(studentLee.studentName + "학번 " + studentLee.studentID);
        System.out.println(Student1.getSerialNum());

        Student2 studentSon = new Student2();
        studentSon.studentName = "손코사";
        System.out.println(studentSon.studentName + "학번 " + studentSon.studentID);

        System.out.println(Student2.getSerialNum());
        //static변수는 클래스를 선언할 때 이미 만들어지는 것이다.
    }
}
