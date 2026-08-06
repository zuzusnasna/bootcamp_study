package chap08.inheritance;

public class CustomerTest2 {
    public static void main(String[] args) {
        int price = 10000;
        Customer customerLee = new Customer(10010, "이순신");
        System.out.println(customerLee + "는 " + customerLee.calcPrice(price) + "원 내야함");
        System.out.println(customerLee + "는 " + customerLee.calcPrice(price) + "원 내야함");


        Customer customerKim = new Customer(10020, "김유신");
        System.out.println(customerKim + "는 " + customerKim.calcPrice(price) + "원 내야함");

        VIPCustomer vc = new VIPCustomer(10030, "나몰라", 2000);
        System.out.println(vc + "는 " + vc.calcPrice(price) + "원 내야함");

    }
}
