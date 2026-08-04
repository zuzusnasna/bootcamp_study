package chap05.reference;

public class Subject2 {
    private String SubjectName;
    private int scorePoint;
/*
    8. private
    private으로 선언된 변수는 외부에서 직접 접근할 수 없다.
    데이터를 보호하기 위해 사용하며, Getter와 Setter를 통해 접근한다.*/

    //Get Method / Set Method 생성
    //마우스 우클릭 - 생성 -Getter 및 Setter 선택후 생성

    /*7. Getter / Setter
    Getter : private 변수의 값을 가져온다.
    Setter : private 변수의 값을 저장하거나 수정한다.
    외부에서 변수에 직접 접근하지 않고 메서드를 통해 접근한다.*/

    public String getSubjectName() {
        return SubjectName;
    }
    public int getScorePoint() {
        return scorePoint;
    }
    public void setSubjectName(String subjectName) {
        SubjectName = subjectName;
    }
    public void setScorePoint(int scorePoint) {
        this.scorePoint = scorePoint;
    }
}
