package quiz._06_chap_06_chap_07_Quiz;

public class BookTest {
    public static void main(String[] args) {
        Book book1 = new Book(30000, "자바 입문");
        Book book2 = new Book(35000, "스프링 부트");
        book1.discount(5000);

        book1.showInfo();
        book2.showInfo();

        System.out.println("전체 책 수 : " +Book.bookCount + "권");
    }
}
