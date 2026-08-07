package chap10.sorting;

public class QuickSort implements Sort{
    @Override
    public void ascending(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
        System.out.println("QuickSort ascending");
    }
    private void quickSort(int[] arr, int start, int end) {
        if(start >= end) {
            return;
        }
        int pivot = partition(arr, start, end);
        quickSort(arr, start, pivot - 1);
        quickSort(arr, pivot + 1, end);
    }
    private int partition(int[] arr, int start, int end) {
        int pivot = arr[end];
        int i = start - 1;
        for(int j = start; j < end; j++) {
            if(arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[end];
        arr[end] = temp;
        return i + 1;
    }

    @Override
    public void descending(int[] arr) {
        quickSortDescending(arr, 0, arr.length - 1);
        System.out.println("QuickSort descending");
    }

    private void quickSortDescending(int[] arr, int start, int end) {
        if(start >= end) {
            return;
        }
        int pivot = partitionDescending(arr, start, end);
        quickSortDescending(arr, start, pivot - 1);
        quickSortDescending(arr, pivot + 1, end);
    }

    private int partitionDescending(int[] arr, int start, int end) {
        int pivot = arr[end];
        int i = start - 1;
        for(int j = start; j < end; j++) {
            // 큰 값을 왼쪽으로
            if(arr[j] > pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[end];
        arr[end] = temp;
        return i + 1;
    }

    @Override
    public void description() {
        Sort.super.description();
        System.out.println("QuickSort 입니다.");
    }
}
