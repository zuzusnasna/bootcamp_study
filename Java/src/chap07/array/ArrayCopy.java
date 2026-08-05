package chap07.array;

public class ArrayCopy {
    public static void main(String[] args) {
        int[] arr1 = {10,20,30,40,50};
        int[] arr2 = {1,2,3,4,5};
/*        System.arraycopy(arr1,0,arr2,1,4);*/
        System.arraycopy(arr1,0,arr2,0,4);
        /*System.arraycopy(원본배열 , 원본 시작인덱스  ,대상 배열, 대상시작 인덱스,복사개수);*/


        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }

    }
}
