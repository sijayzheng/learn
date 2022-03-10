package zheng.sijay.thread;

/**
 * @author 郑世杰
 */
public class TestThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("doing---" + i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        TestThread testThread = new TestThread();
        testThread.start();
    }
}