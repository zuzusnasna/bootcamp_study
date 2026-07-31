package chap02;

public class _02_VariableName {
    public static void main(String[] args) {
        // 변수 이름 짓는 법
        //1. 저장할 값에 어울리는 이름
        //2. 밑줄(_), 문자(abc), 숫자(123) 사용 간능(공백 사용 불가)
        //3. 밑줄 또는 문자로 시작 가능
        //4. 한 단어 또는 2개 이상의 단어의 연속
        //5. 소문자로 시작, 각 단어의 시작 글자는 대문자(Camel Case)
        //6. 예약어 사용 불가(public, static, void, for...)

        // 자바 수업 학생 정보
        String studentName = "김자바"; //학생 이름
        String studentId = "20260001"; //학번
        String major = "컴퓨터공학"; //전공
        String  courseNmae = "Java programming"; //수업명
        String professorName = "홍길동"; //담당 교수
        String classroom = "공학관 301호"; //강의실

        // 변수 예시
        String _courseName = "Java Programming"; //밑줄 시작
        String course_name_2 = "Java Programming"; //밑줄과 숫자 포함
        // String 2course = "Java"; //숫자 시작 불가
        // String  class ="Java"; //예약어 사용 불가

        int classHour = 3; //수업 시간(3시간)
        int studentCount = 30; //수강 인원

        String subject1 = "자바";
        String suject2 = "데이터베이스";
        //String 3 subject = "웹"; //숫자 사용 불가

        //반복문에 자주 사용되는 변수
        int i = 0;
        String s = "";
        String str = "";

        System.out.println(studentName);
        System.out.println(studentId);
        System.out.println(major);
        System.out.println(courseNmae);
        System.out.println(professorName);
        System.out.println(classroom);
        System.out.println(_courseName);
        System.out.println(course_name_2);
        System.out.println(classHour);
        System.out.println(studentCount);
        System.out.println(subject1);
        System.out.println(suject2);




    }

}
