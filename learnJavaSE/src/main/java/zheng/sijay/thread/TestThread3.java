package zheng.sijay.thread;

/**
 * @author 郑世杰
 */
public class TestThread3 implements Runnable {

    public static void main(String[] args) {
        new Thread(new TestThread3()).start();

        for (int i = 0; i < 20; i++) {
            System.out.println("making--------" + i);
        }
        new Thread(() -> {
            for (int i = 0; i < 20; i++) {
                System.out.println("lamd---" + i);
            }
        }).start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("doing---" + i);
        }
    }
}