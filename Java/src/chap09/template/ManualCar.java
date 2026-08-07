package chap09.template;

public class ManualCar extends Car{
    @Override
    public void drive() {
        System.out.println("사람이 움직입니다.");
        System.out.println("핸들 조작이 필요합니다.");
    }

    @Override
    public void stop() {
        System.out.println("브레이크를 밟아 정지합니다.");
    }
}
