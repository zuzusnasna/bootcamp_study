package chap05.coffee;

public class Coffee {
   /* 1. Coffee.java
    Coffee 클래스를 작성하세요.
    Coffee 클래스에는 다음과 같은 인스턴스 변수가 있습니다.
- 메뉴 이름 : menu
- 가격 : price
    CoffeeTest 클래스의 main() 메서드에서 Coffee 객체 coffee1을 생성하고,
    메뉴 이름에는 "아메리카노", 가격에는 4000을 저장한 후 출력하세요.
    [실행 결과]

    아메리카노
    4000

    2. 두 개의 인스턴스 만들기
    CoffeeTest.java
    문제 1에서 만든 Coffee 클래스를 이용하여 두 개의 Coffee 객체를 생성하세요.
    coffee1
- 메뉴 : 아메리카노
- 가격 : 4000
    coffee2
- 메뉴 : 카페라떼
- 가격 : 5000
    각 객체의 메뉴와 가격을 출력하세요.
[실행 결과]
    아메리카노 : 4000원
    카페라떼 : 5000원

3. Coffee 클래스에 커피 정보를 출력하는 showCoffeeInfo() 메서드를 만드세요.

    showCoffeeInfo() 메서드는 다음과 같이 출력합니다.
    메뉴 : 아메리카노
    가격 : 4000원
    CoffeeTest 클래스에서 coffee1 객체를 생성한 후
    showCoffeeInfo() 메서드를 호출하세요.*/ //접기 단축키 ctrl + shift + Numpad (-)

    String menu;
    int price;

    /*public void showCoffeeinfo()
    {
        System.out.println("메뉴 : " + menu + "\n가격 : " + price + "원");
    }*/
    public String showCoffeeInfo(){
        return "메뉴 : " + menu + "\n가격 : " + price + "원";
    }
    public static void main(String[] args) {
        Coffee coffee1 = new Coffee();
        coffee1.menu = "아메리카노";
        coffee1.price = 4000;
        System.out.println(coffee1.menu);
        System.out.println(coffee1.price);
    }
}
