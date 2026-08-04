package chap05.hiding;

public class MyDateTest {
    public static void main(String[] args) {
        MyDate date = new MyDate();
        date.month = 2;
        date.day = 31;
        date.year = 2026;

        System.out.println(date.year + "년 " + date.month + "월 " + date.day + "일");
    }
}
