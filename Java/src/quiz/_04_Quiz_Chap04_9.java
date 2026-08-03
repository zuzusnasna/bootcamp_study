package quiz;

public class _04_Quiz_Chap04_9 {
    public static void main(String[] args) {
        //교재 120p
        //1. operator 값이 + - * / 인 경우에 사칙연산을 수행하는 프로그램을
        //if-else문과 switch-case 문을 사용해 작성해 보시오
        int num1 = 10;
        int num2 = 2;
        char operator = '-';
        /*if(operator == '+')
        {
            System.out.println(num1 + num2);
        }
        else if(operator == '-')
        {
            System.out.println(num1 - num2);
        }
        else if(operator == '*')
        {
            System.out.println(num1 * num2);
        }
        else if(operator == '/')
        {
            System.out.println(num1 / num2);
        }*/
        /*switch (operator) {
            case '+':
                System.out.println(num1 + num2);
                break;
            case '-':
                System.out.println(num1 - num2);
                break;
            case '*':
                System.out.println(num1 * num2);
                break;
            case '/':
                System.out.println(num1 / num2);
                break;
            default:
                System.out.println("오류");
        }*/

        //2.구구단에서 짝수 단만 출력하도록 프로그램을 만들어보세요
        /*for (int i = 2; i < 10; i++) {
            if (i % 2 == 1)
                continue;
            for (int j = 1; j < 10; j ++) {
                System.out.println(i + "X" + j + "=" + i*j);
            }

        }*/

        //6. gender변수 값이 F인경우 '여성입니다'라고 출력하고 그렇지 않은경우
        //'남성입니다'를 출력하도록 코드를 완성해보세요
        /*char gender = 'F';
        if(gender == 'F')
        {
            System.out.println("여성입니다.");
        }
        else
        {
            System.out.println("남성입니다.");
        }*/

        //7.if else
        //이것을 바탕으로 성적에따라 학점을 부여하는 프로그램을 만들어보세요
        //100 ~90 A / 89 ~ 80 B / 79 ~ 70 C/ 69~60 D / 나머지는 F
        /*int score = 76;
        char grade;
        if(score <= 100 && score >= 90)
            System.out.println('A');
        else if(score < 80)
            System.out.println('B');
        else if(score < 70 )
            System.out.println('C');
        else if(score < 60)
            System.out.println('D');
        else
            System.out.println("F");*/

        //10.
        //5층 건물이 있다
        //1층 약국 2층 정형외과 3층 피부과 4층 치과 5층 헬스클럽
        //건물의 츨을 누르면 어떤곳인지 알려주는 엘리베이터 작성
        //switch case문 사용
        /*int stair = 3;
        String message = switch (stair)
        {
            case 1 -> "약국입니다";
            case 2 -> "정형외과입니다";
            case 3 -> "피부과입니다";
            case 4 -> "치과입니다";
            case 5 -> "헬스클럽입니다";
            default -> "잘못된 층입니다 다시눌러주세요";
        };
        System.out.println(stair +"층은 " +message);*/

        //15.
        //1부터 100까지의 수중에서 3의 배수만 출력하는 코드를 완성해보세요
        /*int num;
        for (num = 1; num <=100; num++)
        {
            if(num % 3 != 0)
                continue;
            System.out.println(num);
        }*/

        //16.
        //1부터 시작해서 1씩 숫자를 늘려 더했을때
        //그 합이 500이 넘는 순간 마지막으로 더한 자연수는 얼마인가요
        /*int sum = 0;
        int num;
        for (num = 1; ; num ++)
        {
            sum += num;
            if(sum >= 500)
                break;
        }
        System.out.println(sum);
        System.out.println(num);*/

    }
}
