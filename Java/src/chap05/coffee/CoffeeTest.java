package chap05.coffee;

public class CoffeeTest {

    public static void main(String[] args) {
        Coffee coffee1 = new Coffee();
        coffee1.menu = "아메리카노";
        coffee1.price = 4000;

        Coffee coffee2 = new Coffee();
        coffee2.menu = "카페라떼";
        coffee2.price = 5000;

        System.out.println(coffee1.menu + " : " + coffee1.price + "원");
        System.out.println(coffee2.menu + " : " + coffee2.price + "원");

        /*coffee1.showCoffeeinfo();
        coffee2.showCoffeeinfo();*/
        System.out.println(coffee1.showCoffeeInfo());
        System.out.println(coffee2.showCoffeeInfo());
    }
}
