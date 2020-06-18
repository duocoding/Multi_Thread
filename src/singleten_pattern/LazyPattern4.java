package singleten_pattern;

/**
 * @Auther: qulingxiao
 * @Date: 2020/5/12 17:17
 * @Description:
 */
public class LazyPattern4 {

    private LazyPattern4 () {

    }
    private static class SingletenSafe {
        public static LazyPattern4 lazyPattern4 = new LazyPattern4();
    }

    public static LazyPattern4 getInstance() {
        return SingletenSafe.lazyPattern4;
    }
}
