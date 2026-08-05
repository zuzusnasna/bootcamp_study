package chap05.thisEx;
class BirthDay{
    int day;
    int month;
    int year;

    //태어난 연도를 지정하는 메서드
    public void setYear(int year) {
        this.year = year;
    }

    //this를 출력하는 메서드
    public void printThis() {
        System.out.println(this);
    }
}

public class ThisExample {
    public static void main(String[] args) {
        BirthDay b1 = new BirthDay();
        b1.setYear(2000);
        System.out.println(b1);
        b1.printThis();

        BirthDay b2 = new BirthDay();
        b2.setYear(2001);
        System.out.println(b2);
        b2.printThis();
    }
    //같은 주소 값을 가리킴
}
