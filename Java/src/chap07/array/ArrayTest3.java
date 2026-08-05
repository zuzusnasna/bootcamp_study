package chap07.array;

public class ArrayTest3 {
    public static void main(String[] args) {

        double[] data = new double[5];
        int size = 0;
        data[0] = 10.0; size++; //0
        data[1] = 20.0; size++; //1
        data[2] = 40.0; size++; //2

        for (int i = 0; i < size; i++) {
            System.out.println(data[i]);
        }
        System.out.println(size); //3
    }
}
