package chap09.template;

public class CarTest {
    public static void main(String[] args) {

        System.out.println("===========자율주행 차============");
        Car aicar = new AICar();
        aicar.run();
        System.out.println();
        System.out.println("============수동 차==============");
        Car manucar = new ManualCar();
        manucar.run();
    }
}
