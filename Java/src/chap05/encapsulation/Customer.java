package chap05.encapsulation;

public class Customer {
    private  String name;
    private  double buget; // 예산

    public Customer(String name, double buget) {
        this.name = name;
        this.buget = buget;
    }

    public String getName() {
        return name;
    }

    public void  buyPhone(PhoneStore store){
        Phone phone = store.sellPhone("아이폰", buget);
        if (phone != null){
            System.out.println("고객 : 핸드폰 구입이 완료되었습니다.");
        }
        else {
            System.out.println("고객 : 핸드폰을 구입하지 못했습니다.");
        }
    }
}
