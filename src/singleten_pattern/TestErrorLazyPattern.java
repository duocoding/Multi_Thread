package singleten_pattern;

import wait_notify.Run;

/**
 * @Auther: qulingxiao
 * @Date: 2020/5/10 22:20
 * @Description:
 */
public class TestErrorLazyPattern {

    public static void main(String[] args) {

        Runnable runnable = () -> {
            try {

                System.out.println(ErrorLazyPattern.getInstance().hashCode());
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
