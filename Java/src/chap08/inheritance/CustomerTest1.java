package chap08.inheritance;

public class CustomerTest1 {
    public static void main(String[] args) {

        VIPCustomer customerLee = new VIPCustomer(2020, "김유신",2000);
        customerLee.setCustomerID(10010);
        customerLee.setCustomerName("이순신");
        customerLee.bonusPoint = 1000;
        System.out.println(customerLee.showCustomerInfo());
    }
}
