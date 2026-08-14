package chap15;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class _05_FileReaderTest {
    public static void main(String[] args) {
        try(FileReader fr = new FileReader("reader.txt")) {
            int i;
            while ((i = fr.read()) != -1){
                System.out.print((char) i);
            }
            System.out.println();
            System.out.println("end");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
