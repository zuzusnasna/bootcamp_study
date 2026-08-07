package chap09.runGame;

public class Player {

    //Player가 가지는 level변수 선언
    private PlayerLevel level;

    //디폴트 생성자, 처음 생성되면 BeginnerLevel로 시작하며 레벨 메시지를 출력
    public Player() {
        level = new BeginnerLevel();
        level.showLevelMessage();
    }

    public  PlayerLevel getLevel() {
        return  level;
    }

    //레별변경 메서드, 현재 자신의 level을 매겨변수로 받은 level로 변경하고 레벨 메시지 출력
    public void upgradeLevel(PlayerLevel level){
        this.level = level;
        level.showLevelMessage();
    }

    //PlayerLevel의 템플릿 메서드 go() 호출
    public void play(int count){
        level.go(count);
    }
}
