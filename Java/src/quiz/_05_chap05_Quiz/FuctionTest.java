package quiz._05_chap05_Quiz;

public class FuctionTest {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println(add(a,b));
        System.out.println(substract(a,b));
        System.out.println(multiply(a,b));
        System.out.println(division(a,b));

    }
    public static int add(int a, int b){
        int add = a + b;
        return add;
    }
    public static int substract(int a, int b){
        int substract = a - b;
        return substract;
    }
    public static int multiply(int a, int b){
        int multiply = a * b;
        return multiply;
    }
    public static double division(double a, double b){
        double division = a / b;
        return division;
    }

}
