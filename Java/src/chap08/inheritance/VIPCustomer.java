package chap08.inheritance;

public class VIPCustomer extends Customer {
    private  int customerID;
    private String customerName;
    private String customerGrade;
    int bonusPoint;
    double bonusRatio;

    private int agentID;
    double saleRatio;




    public VIPCustomer(int customerID, String customerName, int agentID){
        super(customerID,customerName);
        customerGrade = "VIP";
        bonusRatio = 0.05;
        saleRatio = 0.1;
        this.agentID = agentID;
        /*System.out.println("VIPCustomer(int, String)생성자 호출");*/
    }
    //디폴트 생성자
/*    public VIPCustomer_() {
        super(customerID,customerName);
        customerGrade = "VIP";
        bonusRatio = 0.05;
        saleRatio = 0.1;
        System.out.println("VIPCustomer 생성자 호출");
    }*/
    //보너스 포인트계산
    public int calcPrice(int price){
        bonusPoint += price * bonusRatio;
        return price - (int)(price * saleRatio);
    }

    public int getAgentID() {
        return agentID;
    }

    public String showCustomerInfo(){
        return customerName + "님의 등급은  " + customerGrade + "이며 , 보너스 포인트는 "
                + bonusPoint + "입니다.";
    }
}
