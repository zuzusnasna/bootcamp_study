package chap10.sorting;

public class HeapSort implements Sort{
    @Override
    public void ascending(int[] arr) {
        int n = arr.length;
        // 최대 힙 생성
        for(int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }
        // 가장 큰 값을 뒤로 이동
        for(int i = n - 1; i > 0; i--) {

            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, i, 0);
        }
        System.out.println("HeapSort ascending");
    }

    @Override
    public void descending(int[] arr) {
        int n = arr.length;
        // 최소 힙 생성
        for(int i = n / 2 - 1; i >= 0; i--) {
            heapifyMin(arr, n, i);
        }
        for(int i = n - 1; i > 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapifyMin(arr, i, 0);
        }

        System.out.println("HeapSort descending");
    }
    private static void heapify(int[] arr, int n, int i) {
        int largest = i;      // 부모
        int left = i * 2 + 1; // 왼쪽 자식
        int right = i * 2 + 2; // 오른쪽 자식
        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }
        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            heapify(arr, n, largest);
        }
    }
    private void heapifyMin(int[] arr, int n, int i) {
        int smallest = i;
        int left = i * 2 + 1;
        int right = i * 2 + 2;
        if (left < n && arr[left] < arr[smallest]) {
            smallest = left;
        }
        if (right < n && arr[right] < arr[smallest]) {
            smallest = right;
        }
        if (smallest != i) {
            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;
            heapifyMin(arr, n, smallest);
        }
    }
    @Override
    public void description() {
        Sort.super.description();
        System.out.println("HeapSort 입니다.");
    }
}
