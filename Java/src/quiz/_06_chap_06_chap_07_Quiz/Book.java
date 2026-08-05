package quiz._06_chap_06_chap_07_Quiz;

public class Book { //Book 클래스를 작성하세요 , 다음과 같은 인스턴스변수가 있습니다
    String title;
    int price;
    static int bookCount = 0; // 지금까지 만들어진 책의 수를 저장하는 static 변수 bookCount 를 선언하세요

    public void showInfo(){ //책 제목과 가격을 출력하는 메서드
        System.out.println("책 제목 : " + title );
        System.out.println("가격 : " + price + "원");
        System.out.println();
    }
    public void discount(int amount){ // 전달받은 금액만큼 책 가격할인하는 메서드
        price -= amount;
    }

    public Book(int price, String title) {
        this.price = price;
        this.title = title;
        bookCount++;
    }

    public int getPrice() { //현재 책 가격 반환 메서드
        return price;
    }
}
