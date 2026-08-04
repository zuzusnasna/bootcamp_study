package quiz._05_chap05_Quiz;
//MyDate 클래스 완성하기
//day, month, year 변수는 private 로 선언
//각 변수의 get, set 메서드를 public으로 정의
//MyDate(int day, int month, int year) 생성자 만들기
//public String isVaild() 메서드를 만들어 날짜가 유효한지 확인
//MyDateTest 클래스에서 생성한 MyDate 날짜가 유효한지 확인합니다
public class MyDate {
    private int day;
    private int month;
    private int year;
    private boolean isValid = true;

    public int getDay() {
        return day;
    }
    public String isValid() {

        if(isValid) {
            return "유효한 날짜입니다.";
        }
        else {
            return "유효하지 않은 날짜입니다.";
        }
    }

    public void setDay(int day) {
        switch(month){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                if(day < 0 || day > 31)
                    isValid = false;
                else
                    this.day = day;
                break;
            case 4: case 6: case 9: case 11:
                if(day < 0 || day > 30)
                    isValid = false;
                else
                    this.day = day;
            case 2:
               if (( ( year % 4 ==0 &&  year % 100 !=0 ) || year % 400 ==0))
                   isValid = false;
               else
                   this.day = day;
        }
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if( month <1 || month >12) {
            isValid = false;
        }
        else {
            this.month = month;
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public MyDate(int day, int month, int year){
        setYear(year);
        setMonth(month);
        setDay(day);
    }
}