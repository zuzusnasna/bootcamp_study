package quiz;

public class _03_Quiz_chap03 {
    public static void main(String[] args) {
        //1.
        //택배 배송정보를 출력하는 프로그램을 작성하시오
        //각 정보는 적절한 자료형의 변수에 정의합니다
        //정보
        //-운송장 번호는 " 1234567890" 과 같은 형태
        //-배송까지 남은 일수는 일 단위(예: 1일 , 2일)
        //-택배 무게는 kg 단위(예 2.5kg, 0.8kg)
        //실행결과
        //운송장번호 1234567890
        //배송까지 2일 남았습니다
        //택배 무게:2.5kg
        int num = 1234567890;
        int day = 3;
        double moogae = 2.14;
        System.out.println("운송장 번호 : " + num);
        System.out.println("배송까지 " + day + "일 남았습니다.");
        System.out.println("택배 무게: " + moogae + "kg");

        //2.
        //삼항연산자
        //나이로 영화 관람 여부
        //나이가 15세 이상이면 관람가능합니다를 그렇지 않으면 관람이 불가능합니다를 출력하는 프로그램을 작성하시오
        int age = 18;
        String yes = "관람 가능합니다";
        String no = "관람이 불가능합니다";
        System.out.println((age >= 15) ? yes : no);

        //3. 구매 금액이 30000원 이상이면 무료배송입니다를
        //   그렇지 않으면 배송비가 부과됩니다를 출력하는 프로그램을 작성 하세요
        int price = 25000;
        String ok = "무료 배송입니다.";
        String Bbaggu = "배송비가 부과됩니다";
        System.out.println("금액이 " + price + " 이므로 " + ((price >= 30000) ? ok : Bbaggu));

    }
}
