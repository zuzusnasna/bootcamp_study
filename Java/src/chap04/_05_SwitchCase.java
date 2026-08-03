package chap04;

public class _05_SwitchCase {
    public static void main(String[] args) {
        int ranking = 1;
        char medalcolor;

        switch (ranking){
            //랭킹이 1
            case 1: medalcolor = 'g';
            break;
            case 2: medalcolor = 's';
            break;
            case 3: medalcolor = 'b';
            break;
            default:
            medalcolor = 'A';
        }
        System.out.println(ranking + "등의 메댈 색은? " + medalcolor + " 입니다");
    }
}
