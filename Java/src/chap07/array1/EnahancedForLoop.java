package chap07.array1;

public class EnahancedForLoop {
    public static void main(String[] args) {

        String[] strArray = {"Java" ,"C","Python" ,"JavaSecpt" , "Android"};

        for (String lang: strArray){
            System.out.println(lang);
        }

        int[] arr = {1,2,4,5,6};
        for (int i : arr){
            System.out.println(i);
        }
    }
}
