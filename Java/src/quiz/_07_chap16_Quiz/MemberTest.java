package quiz._07_chap16_Quiz;

import java.util.ArrayList;
import java.util.Scanner;

class Member {
    private int studentId;
    private String name;

    public Member(int studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }
}

public class MemberTest {

    public static void main(String[] args) {

        ArrayList<Member> memberList = new ArrayList<>();

        memberList.add(new Member(2026001, "김민준"));
        memberList.add(new Member(2026002, "이서연"));
        memberList.add(new Member(2026003, "박지훈"));
        memberList.add(new Member(2026004, "최유진"));
        memberList.add(new Member(2026005, "정현우"));

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("학번 입력 : ");
            int studentId = scanner.nextInt();

            System.out.print("이름 입력 : ");
            String name = scanner.next();

            boolean isMember = memberList.stream()
                    .anyMatch(member ->
                            member.getStudentId() == studentId
                                    && member.getName().equals(name));

            if (isMember) {
                System.out.println("등록된 회원입니다.");

                System.out.println("회원 이름 목록");

                memberList.stream()
                        .map(Member::getName)
                        .sorted()
                        .forEach(memberName ->
                                System.out.print(memberName + " "));

                System.out.println();

            } else {
                System.out.println("등록되지 않은 회원입니다.");
            }

        } catch (Exception e) {
            System.out.println("회원 정보를 처리하는 중 오류가 발생했습니다.");

        } finally {
            System.out.println("회원 확인을 종료합니다.");
            scanner.close();
        }
    }
}