package chap16;

public class SyncMainTest {

    public static Bank myBank = new Bank();

    public static void main(String[] args) throws InterruptedException {
        Park p = new Park();
        p.start();

        Thread.sleep(200);

        ParkWife pw = new ParkWife();
        pw.start();
    }
}