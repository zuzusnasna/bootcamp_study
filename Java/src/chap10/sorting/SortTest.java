package chap10.sorting;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class SortTest {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("====================");
            System.out.println(" 정렬 프로그램");
            System.out.println("====================");
            System.out.println("B : BubbleSort");
            System.out.println("H : HeapSort");
            System.out.println("Q : QuickSort");
            System.out.println("E : 종료");
            System.out.print("선택 : ");

            char ch = sc.next().charAt(0);
            Sort sort = null;
            if(ch == 'B' || ch == 'b') {
                sort = new BubbleSort();
            }
            else if(ch == 'H' || ch == 'h') {
                sort = new HeapSort();
            }
            else if(ch == 'Q' || ch == 'q') {
                sort = new QuickSort();
            }
            else if(ch == 'E' || ch == 'e') {
                System.out.println("프로그램 종료");
                break;
            }
            else {
                System.out.println("지원되지 않는 기능입니다.");
                break;
            }

            // 배열 입력
            System.out.print("배열 크기 입력 : ");
            int size = sc.nextInt();
            int[] arr = new int[size];
            System.out.println("숫자를 입력하세요.");
            for(int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println("원본 배열");
            System.out.println(Arrays.toString(arr));

            // 방향 선택
            System.out.println("1. 오름차순");
            System.out.println("2. 내림차순");
            System.out.print("선택 : ");

            int direction = sc.nextInt();
            long start = System.nanoTime();
            if(direction == 1) {
                sort.ascending(arr);
            }
            else if(direction == 2) {
                sort.descending(arr);
            }
            else {
                System.out.println("잘못된 선택입니다.");
                continue;
            }
            long end = System.nanoTime();

            System.out.println("정렬 결과");
            System.out.println(Arrays.toString(arr));
            System.out.println("실행 시간 : "
                    + (end-start) + "ns");
            sort.description();
            System.out.println();
        }

        sc.close();
    }
}