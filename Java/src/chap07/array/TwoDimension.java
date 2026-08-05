package chap07.array;

public class TwoDimension {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);
            }
            System.out.println();
            // [0][0]   [0][1]  [0][2]
            // [1][0]   [1][1]  [1][2]
        }
    }
}
