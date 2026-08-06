package chap07.array1;

public class ObjectCopy3 {//깊은 복사
    // bookArray1, boolArray2의 0번 인덱스의 값이 다름
    //복사할 배열에 인스턴스를 따로 생성
    //기존 배열요소와 서로다른 인스턴스를 가리키므로 기존 배열의ㅇ쇼ㅗ값이 변경되어도 영향을 받지 않는다
    public static void main(String[] args) {
        Book[] bookArray1 = new Book[3];
        Book[] bookArray2 = new Book[3];

        bookArray1[0] = new Book("데미안1", "헤르만 해세");
        bookArray1[1] = new Book("데미안2", "헤르만 해세");
        bookArray1[2] = new Book("데미안3", "헤르만 해세");

        bookArray2[0] = new Book(); //인스턴스 새로 생성
        bookArray2[1] = new Book();// 다른 인스턴스를 가리킴
        bookArray2[2] = new Book();

        for (int i = 0; i < bookArray1.length; i++) {
            bookArray2[i].setBookName((bookArray1[i].getBookName()));
            bookArray2[i].setAuthor(bookArray1[i].getAuthor());
        }

        System.out.println("=====================booArray1===================");
        for (int i = 0; i < bookArray1.length; i++) {
            bookArray1[i].showBookInfo();
        }

        System.out.println("=====================booArray2===================");
        for (int i = 0; i < bookArray2.length; i++) {
            bookArray2[i].showBookInfo();
        }
        bookArray1[0].setBookName("나목");
        bookArray1[0].setAuthor("박완선");

        System.out.println("=====================booArray1===================");
        for (int i = 0; i < bookArray1.length; i++) {
            bookArray1[i].showBookInfo();
        }

        System.out.println("=====================booArray2===================");
        for (int i = 0; i < bookArray2.length; i++) {
            bookArray2[i].showBookInfo();
        }
    }
}
