package zheng.sijay.thread;

/**
 * @author 郑世杰
 * @date 2022/3/10 20:44
 */
public class TestJoin implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("run join " + i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        TestJoin testJoin = new TestJoin();
        Thread thread = new Thread(testJoin);
        thread.start();
        for (int i = 0; i < 1000; i++) {
            if (i == 100) {
                thread.join();
            }
            System.out.println("main " + i);
        }
        Thread.State state = thread.getState();
    }
}
