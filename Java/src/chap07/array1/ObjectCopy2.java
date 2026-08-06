package chap07.array1;

public class ObjectCopy2 { //얕은 복사
    // bookArray1, boolArray2의 0번 인덱스 모두 결과값 동일
    public static void main(String[] args) {
        Book[] bookArray1 = new Book[3];
        Book[] bookArray2 = new Book[3];

        bookArray1[0] = new Book("데미안1", "헤르만 해세");
        bookArray1[1] = new Book("데미안2", "헤르만 해세");
        bookArray1[2] = new Book("데미안3", "헤르만 해세");

        System.arraycopy(bookArray1, 0, bookArray2,0,3);
        for (int i = 0; i < bookArray1.length; i++) {
            bookArray2[i].showBookInfo();
            }
        bookArray1[0].setBookName("나목");
        bookArray1[1].setAuthor("박완선");

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
