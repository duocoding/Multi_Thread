package wait_notify;

/**
 * @Auther: qulingxiao
 * @Date: 2020/4/25 11:19
 * @Description:
 */
public class ThreadP extends Thread {
    private Productor productor;
    public ThreadP (Productor productor) {
        super();
        this.productor = productor;
    }
    @Override
    public void run () {
        while (true) {
            productor.setValue();
        }
    }
}
