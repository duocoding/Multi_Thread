package singleten_pattern;

/**
 * @Auther: qulingxiao
 * @Date: 2020/5/10 22:41
 * @Description:
 */
public class LazyPattern2 {

    private static LazyPattern2 lazyPattern2;

    private LazyPattern2() {

    }

    public static LazyPattern2 getInstance() throws InterruptedException {
        if(lazyPattern2 != null) {
        } else {
            Thread.sleep(3000);
            synchronized(Object.class) {
                lazyPattern2 = new LazyPattern2();
            }
        }
        return lazyPattern2;
    }
}
