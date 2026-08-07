package chap09.template;

public class AICar extends Car{
    @Override
    public void drive() {
        System.out.println("자율주행 모드.");
        System.out.println("알아서 움직입니다");
    }

    @Override
    public void stop() {
        System.out.println("물체감지. 멈춥니다");
    }
}
