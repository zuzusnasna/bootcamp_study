package chap05.constructor;

public class PensonTest {
    public static void main(String[] args) {
        Person personLee = new Person();
        personLee.name = "이순신";
        System.out.println("이름 : " + personLee.name);

        Person personKim = new Person("김유신", 175,75);
        //인스턴스 변수를 초기화하는 동시에 클래스 생성 코드가 간결, 사용에 편리
        System.out.println(personKim.name);
        System.out.println(personKim.height);
        System.out.println(personKim.weight);
    }
}
