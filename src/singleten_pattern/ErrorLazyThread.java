package singleten_pattern;

/**
 * @Auther: qulingxiao
 * @Date: 2020/5/10 22:18
 * @Description:
 */
public class ErrorLazyThread extends Thread{

    @Override
    public void run () {
        try {
            System.out.println(ErrorLazyPattern.getInstance().hashCode());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
