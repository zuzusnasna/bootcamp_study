package chap10.sorting;

public class QuickSort implements Sort{
    @Override
    public void ascending(int[] arr) {
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = 0; j < arr.length - 1 - i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("QuickSort ascending");
    }

    @Override
    public void descending(int[] arr) {
        for(int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("QuickSort descending");
    }

    @Override
    public void description() {
        Sort.super.description();
        System.out.println("QuickSort 입니다.");
    }
}
