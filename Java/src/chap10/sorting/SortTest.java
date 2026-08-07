package chap10.sorting;

import java.io.IOException;
import java.util.Arrays;

public class SortTest {
    public static void main(String[] args) throws IOException {
        System.out.println("정렬방식을 선택하시오.");
        System.out.println("B : BubbleSort");
        System.out.println("H : HeapSort");
        System.out.println("Q : QuickSort");

        Sort sort = null;
        while (true)
        {
            int ch = System.in.read();
            if(ch == '\n' || ch == '\r')
                continue;
            if (ch == 'B' || ch == 'b')
                sort = new BubbleSort();
            else if (ch == 'H' || ch == 'h')
                sort = new HeapSort();
            else if (ch == 'Q' || ch == 'q')
                sort = new QuickSort();
            else {
                System.out.println("지원되지 않는 기능입니다.");
                break;
            }
            break;
        }
        int[] arr = {5,3,8,1,2,7,4,10,6,9};


        sort.ascending(arr);

        System.out.println("오름차순 결과");
        System.out.println(Arrays.toString(arr));


        sort.descending(arr);

        System.out.println("내림차순 결과");
        System.out.println(Arrays.toString(arr));


        sort.description();

        sort.ascending(arr);
        sort.descending(arr);
        sort.description();
    }
}
