package wait_notify;

import synchronized_test_4_19.PublicVar;

/**
 * @Auther: qulingxiao
 * @Date: 2020/4/25 11:20
 * @Description:
 */
public class ThreadC extends Thread {
    private Consumer consumer;
    public ThreadC (Consumer consumer) {
        super();
        this.consumer = consumer;
    }
    @Override
    public void run () {
        while (true) {
            consumer.getValue();
        }
    }
}
