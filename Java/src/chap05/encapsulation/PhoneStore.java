package chap05.encapsulation;

public class PhoneStore {
    private Phone phone;

    public PhoneStore(Phone phone) {
        this.phone = phone;
    }

    public  Phone sellPhone(String model, double buget)
    {
        String phoneModel = phone.getModel();

        if(model.equals(phoneModel) && buget >= phone.getPrice()){
            registerPayment();
            discountPromotion();
            saveDate();
            return phone;
        }
        else return  null;
    }
    private void registerPayment() {
        System.out.println("대리점 : 요금제 등록을 합니다. 약정을 등록");
    }
    private void discountPromotion() {
        System.out.println("대리점 : 프로모션으로 할인합니다.");
    }
    private void saveDate() {
        System.out.println("대리점 : 데이터를 저장하고 새로운 폰으로 이동합니다.");
    }

}
