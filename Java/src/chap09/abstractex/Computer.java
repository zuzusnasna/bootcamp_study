package chap09.abstractex;

public abstract class Computer {

    //추상 메서그 - 구현부분이 없음
    public abstract void display();
    public abstract void  typing();

    public  void turnon(){
        System.out.println("전원을 켭니다");
    }
    public  void trunoff(){
        System.out.println("전원을 켭니다");
    }
}
