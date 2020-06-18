package singleten_pattern;

/**
 * @Auther: qulingxiao
 * @Date: 2020/5/10 22:13
 * @Description:
 */
public class ErrorLazyPattern {

    private static ErrorLazyPattern errorLazyPattern;

    private ErrorLazyPattern() {

    }

    public static ErrorLazyPattern getInstance() throws InterruptedException {

        if(errorLazyPattern != null) {
        } else {
            Thread.sleep(3000);
            errorLazyPattern = new ErrorLazyPattern();
        }
        return errorLazyPattern;
    }
}
