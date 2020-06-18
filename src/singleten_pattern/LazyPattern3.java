package singleten_pattern;

/**
 * @Auther: qulingxiao
 * @Date: 2020/5/10 22:46
 * @Description:
 */
public class LazyPattern3 {
    private volatile static LazyPattern3 lazyPattern3;
    private LazyPattern3() {

    }
    public static LazyPattern3 getInstance() throws InterruptedException {
        if(lazyPattern3 != null) {
        } else {
            Thread.sleep(3000);
            synchronized(Object.class) {
                if(lazyPattern3 == null) {
                    lazyPattern3 = new LazyPattern3();
                }
            }
        }
        return lazyPattern3;
    }
}
