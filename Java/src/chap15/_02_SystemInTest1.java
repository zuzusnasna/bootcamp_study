package chap15;

import java.io.IOException;

public class _02_SystemInTest1 {
    public static void main(String[] args) {

        int i = 0;
        try {
            while((i=System.in.read()) != '\n'){
                System.out.print((char)i );
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(i);
    }
}
