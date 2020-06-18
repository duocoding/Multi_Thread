package singleten_pattern;

/**
 * @Auther: qulingxiao
 * @Date: 2020/5/12 17:22
 * @Description:
 */
public class TestLazyThread4 {

    public static void main(String[] args) {

        Runnable runnable = () ->
            System.out.println(LazyPattern4.getInstance().hashCode());

        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        Thread thread3 = new Thread(runnable);
        thread1.start();
        thread2.start();
        thread3.start();

    }
}
