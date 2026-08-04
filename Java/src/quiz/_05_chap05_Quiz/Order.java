package quiz._05_chap05_Quiz;

public class Order {
    int orderNum;
    String userID;
    String orderDate;
    String userName;
    String productNum;
    String address;

    public Order(int orderNum, String userID, String orderDate, String userName, String productNum, String address) {
        this.orderNum=orderNum;
        this.userID =userID;
        this.orderDate=orderDate;
        this.userName=userName;
        this.productNum=productNum;
        this.address=address;
    }

    public void showOrderlist() {
        System.out.println("주문 번호 : "+orderNum);
        System.out.println("주문자 아이디 : "+userID);
        System.out.println("주문 날짜 : "+orderDate);
        System.out.println("주문자 이름 : "+userName);
        System.out.println("주문 상품 번호 : "+productNum);
        System.out.println("배송 주소 : "+address);
    }
}
