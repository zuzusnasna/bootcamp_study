package chap05.classpart.student; //패키지 선언

public class Student { //클래스 선언
    int studentID;                                 //학번
    String studentName;                     //이름
    int grade;                                       //학년
    String address;                              //사는곳

    public String getStudentName(){ //메서드 (함수)
        return studentName;
    }
    public String getAddress(){
        return address;
    }

    //클래스 내부에 메인함수 생성
    public static void main(String[] args) {
        Student studentAhn = new Student();
        studentAhn.studentName = "안연수";
        studentAhn.address = "서울시 송파구 중대로";

        System.out.println(studentAhn.getStudentName());
        System.out.println(studentAhn.getAddress());
    }
}
