package synchronized_test_4_19;

/**
 * @Auther: qulingxiao
 * @Date: 2020/4/19 09:55
 * @Description:
 */
public class Test_synchronized {

    public static void main(String[] args) {
        try {
            PublicVar publicVar = new PublicVar();
            ThreadA thread = new ThreadA(publicVar);
            thread.start();
            Thread.sleep(200);
            publicVar.getValue();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
