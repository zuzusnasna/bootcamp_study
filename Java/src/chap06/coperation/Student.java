package chap06.coperation;

public class Student {
    public String studentName;
    public  int grade;
    public int money;

    //학생 이름과 가진 돈의 생성자
    public Student(String studentName, int money) {
        this.studentName = studentName;
        this.money = money;
    }

    //버스를 타면 1000원을 지불하는 메서드
    public  void takeBus(Bus bus){
        bus.take(1000);
        this.money -= 1000;
    }
    //지하철을 타면 1500원을 지불하는 메서드
    public  void takeSubway(Subway subway){
        subway.take(1500);
        this.money -= 1500;
    }
    public void showInfo() {
        System.out.println(studentName + "님의 남은 돈은 " + money + "원 입니다");
    }
}
