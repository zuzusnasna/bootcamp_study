package chap06.singleton;

public class Company {
    private static Company instance = new Company();
    
    //company라는 생성자를 만듬
    private  Company(){
        
    }
    //프로그램이 시작될 때 Company객체를 딱 한 번만 생성합니다.
    //인스턴스를 외부에서 참조할 수 있도록 public get () 구현
    public static Company getInstance() {
        if (instance == null) {
            instance = new Company();
        }
        return instance; //새로 만드는 것이 아니라 이미 만들어져 있는 객체를 돌려주는 것이다.
    }
}
