package chap07.arrayList.libreary;

public class Test {
    public static void main(String[] args) {

        Book book1 = new Book("자바 입문", 30_000);
        Book book2 = new Book("스프링부트", 35_000);
        Book book3 = new Book("데이터 베이스", 25_000);

        Library lib = new Library();

        lib.addBook(book1);
        lib.addBook(book2);
        lib.addBook(book3);

        lib.showBookInfo();
    }
}
