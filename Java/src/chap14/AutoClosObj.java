package chap14;

public class AutoClosObj implements AutoCloseable {
    @Override
    public void close() throws Exception{
        System.out.println("리소스가 CLOSE()되었습니다");
    }
}
