package singleten_pattern;

import java.util.concurrent.SynchronousQueue;

/**
 * @Auther: qulingxiao
 * @Date: 2020/5/10 22:33
 * @Description:
 */
public class LazyPattern1 {

    private static LazyPattern1 lazyPattern1;

    private LazyPattern1() {

    }

    synchronized public static LazyPattern1 getInstance() throws InterruptedException {
        if(lazyPattern1 != null) {
        } else {
            Thread.sleep(3000);
            lazyPattern1 = new LazyPattern1();
        }
        return lazyPattern1;
    }
}
