package chap10.scheduler;

import java.io.IOException;

public class SchedularTest {
    public static void main(String[] args) throws IOException {
        System.out.println("전화 상담 할당 방식");
        System.out.println("R(oundRobin): 한 명씩 차례대로 할당");
        System.out.println("L(eastJob): 쉬고 있거나 대기가 적은 상담원 할당");
        System.out.println("P(riorityAllocation) : 우선순위가 높은 고객 할당");



        while(true)
        {
            int ch = System.in.read(); // 표준 입력 스트림
            Scheduler scheduler = null;
            //엔터 때문에 들어온 줄바꿈 문자는 무시해라
            if(ch == '\n' || ch == '\r')
                continue;
            if (ch == 'R' || ch == 'r')
                scheduler = new RoundRobin();
            else if (ch == 'P' || ch == 'p')
                scheduler = new PriorityAllocation();
            else if (ch == 'L' || ch == 'l')
                scheduler = new LeastJob();
            else {
                System.out.println("지원하지 않는 기능입니다.");
                break;
            }
            scheduler.getNextCall();
            scheduler.sendCallToAgent();
        }


    }
}
