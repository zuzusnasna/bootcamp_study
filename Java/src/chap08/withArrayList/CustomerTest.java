package chap08.withArrayList;

import java.util.ArrayList;

public class CustomerTest {
    public static void main(String[] args) {
        ArrayList<Customer> customerList = new ArrayList<>();

        Customer customer1 = new Customer(10010, "One");
        Customer customer2 = new Customer(10020, "Two");
        Customer customer3 = new GoldCustomer(10030, "Three");
        Customer customer4 = new GoldCustomer(10040, "Four");
        Customer customer5 = new VIPCustomer(10050, "Five", 110);

        customerList.add(customer1);
        customerList.add(customer2);
        customerList.add(customer3);
        customerList.add(customer4);
        customerList.add(customer5);

        int price = 10000;
        for (Customer customer : customerList) {
            int cost = customer.calcPrice(price);
            System.out.println("========================지불 금액======================");
            System.out.println(customer.getCustomerName() + "님은 " + cost + "원 지불하셨습니다");
            System.out.println("--------------------------------------고객 정보----------------------------------------");
            System.out.println(customer.showCustomerInfo());
        }
        System.out.println("====================================================");
    }
}
