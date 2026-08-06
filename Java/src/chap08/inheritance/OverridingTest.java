package chap08.inheritance;

public class OverridingTest {
    public static void main(String[] args) {
        Customer customerLee = new Customer(10010, "이순신");
        customerLee.bonusPoint = 1000;

        VIPCustomer customerKim = new VIPCustomer(10020, "김유신",12345);
        customerKim.bonusPoint = 1000;

        VIPCustomer vc = new VIPCustomer(10030, "나몰라",2000);
        vc.bonusPoint = 1000;

        GoldCustomer customerKang = new GoldCustomer(10030, "강감찬");

        PlatinumCustomer pc = new PlatinumCustomer(10040, "유관순", 3000);

        int price = 40000;
        System.out.println(customerLee.getCustomerName() + "님이 지불해야 하는 금액은 " +
                customerLee.calcPrice(price) + "원 입니다.");
        System.out.println(customerKim.getCustomerName() + "님이 지불해야 하는 금액은 " +
                customerKim.calcPrice(price) + "원 입니다.");
        System.out.println(vc.getCustomerName() + "님이 지불해야 하는 금액은 " +
                vc.calcPrice(price) + "원 입니다.");
        System.out.println(customerKang.getCustomerName() + "님이 지불해야 하는 금액은 " +
                customerKang.calcPrice(price) + "원 입니다.");
        System.out.println(pc.getCustomerName() + "님이 지불해야 하는 금액은 " +
                pc.calcPrice(price) + "원 입니다.");
    }
}
