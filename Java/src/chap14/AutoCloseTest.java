package chap14;

public class AutoCloseTest {
    public static void main(String[] args) {
        try(AutoClosObj obj = new AutoClosObj()) {
            throw  new Exception();
        }catch (Exception e){
            System.out.println("예외부분입니다");
        }
    }
}
