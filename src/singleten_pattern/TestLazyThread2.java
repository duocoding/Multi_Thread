package singleten_pattern;

/**
 * @Auther: qulingxiao
 * @Date: 2020/5/10 22:45
 * @Description:
 */
public class TestLazyThread2 {

    public static void main(String[] args) {
        Runnable runnable = () ->
        {
            try {
                System.out.println(LazyPattern2.getInstance().hashCode());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        Thread thread3 = new Thread(runnable);
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
