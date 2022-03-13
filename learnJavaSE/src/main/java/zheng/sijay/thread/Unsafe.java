package zheng.sijay.thread;

/**
 * @author 郑世杰
 */
public class Unsafe {
    public static void main(String[] args) {
        BuyTicket buyTicket = new BuyTicket();
        new Thread(buyTicket, "tom").start();
        new Thread(buyTicket, "jan").start();
        new Thread(buyTicket, "alen").start();
    }
}

class BuyTicket implements Runnable {
    private int nums = 10;
    boolean flag = true;

    @Override
    public void run() {
        while (flag) {
            try {
                buy();
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private synchronized void buy() {
        if (nums < 1) {
            flag = false;
            return;
        }
        System.out.println(Thread.currentThread()
                                 .getName() + " take the " + nums--);
    }
}