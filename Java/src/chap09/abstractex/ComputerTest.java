package chap09.abstractex;

public class ComputerTest {
    public static void main(String[] args) {

        //Computer c1 = new Computer(); //추상 클래스는 인스턴스로 선언 불가
        Computer c2 = new Desktop();
        Computer c3 = new NoteBook() {//추상 클래스는 인스턴스로 선언 불가
            @Override                               //메서드 재정의 필수
            public void typing() {
                System.out.println("추상 클래스는 인스턴스로 선언 불가 , 메서드 재정의 필수");
            }
        };
        Computer c4 = new MyNoteBook();

        //c1.display();
        c2.display();
        c3.typing();
        c4.display();
        //상속과 다형성의 원리 : 가져 오면서 추상메서드
    }
}
