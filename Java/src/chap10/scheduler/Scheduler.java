package chap10.scheduler;

public interface Scheduler {

    //콜 대기 상담원
    public void getNextCall(); //다음 고객의 콜을 가져오는 것
    public  void sendCallToAgent(); //상담원에게 콜을 던지는 것
}
