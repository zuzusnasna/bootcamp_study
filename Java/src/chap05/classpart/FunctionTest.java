package chap05.classpart;

public class FunctionTest {
    public static void main(String[] args) {
        //메서드
        //함수를 구현하고 호출하는 부분을 구현해보자
        int num1 = 10;
        int num2 = 20;
        int sum = addNum(num1, num2);
        int substract = substractNum(num1,num2);
        int multiply = multiplyNum(num1, num2);
        double division = divisionNum(num1,num2);
        System.out.println(sum);
        System.out.println(substract);
        System.out.println(multiply);
        System.out.println(division);

    }
    public  static  int addNum(int n1, int n2)
    {
        int result = n1 + n2;
        return result;
    }
    public  static  int substractNum(int n1, int n2)
    {
        int result = n1 - n2;
        return result;
    }
    public  static  int multiplyNum(int n1, int n2)
    {
        int result = n1 * n2;
        return result;
    }
    public  static  double divisionNum(double n1, double n2)
    {
        double result = n1 / n2;
        return result;
    }

    //main() 힘스기 시영힐 메모리공간이 스택에 형성
    //main()함수에서 add()함수 호출
    //add()함수가 사용할 메모리 공간이 스택에 생성됨
    //add()함수가 사용한 메모리 공간은 자동으로 사라짐
    //add()함수 수행 후 메모리 해제

    //함수의 장점
    //1. 함수를 사용하면 기능을 나누어 코드를 효율적으로 구현가능
    //2. 기능별로 함수를 구현해 놓으면 같은 기능을 매번 코드로 만들지 않고 그 기능의 함수를 호출하면되서 편리
    //3. 프로그램을 실행할 때 생긴 오류를 수정하는 디버깅 작업(유지보수)을 할때도 편리
}
