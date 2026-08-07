package chap09.abstractex;

public abstract class NoteBook extends Computer{
    //새로운 일반 클래스 정의 시, 추상 클래스로 정의된 클래스 내부의 메서드는 전부 다 받아야한다
    //아니면 새로 정의하는 클래스도 추상 클래스로 정의하여야한다
    @Override
    public void display() {
        System.out.println("NoteBook Display() ");
    }

}
