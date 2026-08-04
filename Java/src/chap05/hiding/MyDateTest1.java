package chap05.hiding;

public class MyDateTest1 {
    public static void main(String[] args) {
        MyDate1 date1 = new MyDate1();


        date1.setMonth(2);
        date1.setDay(31);
        date1.setYear(2026);

        System.out.println(date1.getYear() + "년 " + date1.getMonth() + "월 " + date1.getDay() + "일" );
        /*date.month = 2;
        date.day = 31;
        date.year = 2026;

        System.out.println(date.year + "년 " + date.month + "월 " + date.day + "일");*/
    }
}
