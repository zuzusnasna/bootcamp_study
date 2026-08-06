package chap07.arrayList.libreary;

import java.util.ArrayList;

public class Library {
    ArrayList<Book> books;
    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) { // 2
        if (book == null) {
            System.out.println("책이 없습니다.");
            return;
        }
        books.add(book);
    }

    public void showBookInfo() {
        for (Book book : books) {
            System.out.printf("책제목 : %s, 가격: %,d원 \r\n", book.getTitle(), book.getPrice());

        /*\r\n
        \r : Carriage Return (커서를 줄의 맨 앞으로 이동)
        \n : Line Feed (다음 줄로 이동)*/
        }
    }
}
