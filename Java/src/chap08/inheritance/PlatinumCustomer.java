package chap08.inheritance;

public class PlatinumCustomer extends Customer{
    double saleRatio;

    public PlatinumCustomer(int customerID, String customerName, int agetID){
        super(customerID, customerName);
        customerGrade = "PLATINUM";
        saleRatio = 0.15;
        bonusRatio = 0.07;
    }
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price - (int)(price * saleRatio);
    }
}
