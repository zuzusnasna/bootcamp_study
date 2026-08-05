package chap06.staticEx;

public class Student2 {
    public static int serialNum =1000;

    int studentID;
    String studentName;

    public static int getSerialNum() {
        int i = 10;
        i++;
        System.out.println(i);
        return serialNum;
    }

    public Student2(){
        serialNum++; // 이 값이 공유 되면서 증가할 것이다
        studentID = serialNum; //studentID 에 serialNum이 복사되어 각각의  동일한 studentID를 가짐

    }
}
