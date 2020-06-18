package singleten_pattern;

/**
 * @Auther: qulingxiao
 * @Date: 2020/5/10 21:44
 * @Description:
 */
public class TestHungryPattern {

    public static void main(String[] args) {
        Runnable runnable = () ->
            System.out.println(HungryPattern.getInstance().hashCode());

        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        Thread thread3 = new Thread(runnable);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
