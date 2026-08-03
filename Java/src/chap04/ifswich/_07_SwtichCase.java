package chap04.ifswich;

public class _07_SwtichCase {
    public static void main(String[] args) {
        String medal = "Gold";

        String message = switch (medal)
        {
            case "Gold" -> ("금메달입니다.");
            case "Silver" -> ("은메달입니다.");
            case "Bronze" -> ("동메달입니다.");
            default -> ("메달이 없습니다.");
        }; //switch 표현식이 끝나므로 세미콜론을 반드시 작성
        System.out.println(message);
    }
}
