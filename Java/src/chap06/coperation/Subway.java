package chap06.coperation;

public class Subway {
    String lineNumber;
    int passengerCount;
    int money;

    public Subway(String lineNumber) {
        this.lineNumber = lineNumber;
    }
    //승객이 지하철을 탄 경우 메서드
    public  void take(int money){
        this.money += money;
        passengerCount++;
    }
    public void showInfo() {
        System.out.println("지하철  " + lineNumber + "의 승객은" +
                passengerCount + "명 이고, 수입은 " + money + "입니다.");
    }
}
