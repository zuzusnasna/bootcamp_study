package chap07.array1;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        //선언
        ArrayList<Book> library = new ArrayList<>();

        //add() 메서드 요소
        library.add(new Book("태백산맥1", "조정래"));
        library.add(new Book("태백산맥2", "조정래"));
        library.add(new Book("태백산맥3", "조정래"));
        library.add(new Book("태백산맥4", "조정래"));

        for (int i = 0; i < library.size(); i++) {
            Book book = library.get(i);
            book.showBookInfo();;
        }
        System.out.println();
        System.out.println("향상된 for문으로 출력 해보기");
        for (Book book : library) { /// iter -> 향상된 for문 단축키 -> 범위지정없이 전 요소 출력이나 조회
            book.showBookInfo();
        }
    }
}
