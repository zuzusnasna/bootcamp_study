package chap07.array;

public class ArrayTest {
    public static void main(String[] args) {

        int[] numbers1 = new int[10];
        int[] numbers2 = new int[]{0,1,2};
        //int[] numbers4 = new int[3]{0,1,2}; -> 오류
        int[] numbers3 = {0,1,2};
        int[] number = new int[]{1,2,3,4,5,6,7,8,9,10};
        for (int i = 0;i < number.length;i++) {
            System.out.println(number[i]);
            System.out.println(numbers1[i]);
            System.out.println(numbers2[i]);
            System.out.println(numbers3[i]);
        }
    }
}
