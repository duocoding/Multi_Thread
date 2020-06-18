package synchronized_test_4_19;

/**
 * @Auther: qulingxiao
 * @Date: 2020/4/19 09:51
 * @Description:
 */
public class ThreadA extends Thread{
    private PublicVar publicVar;
    public ThreadA(PublicVar publicVar) {
        super();
        this.publicVar = publicVar;
    }

    @Override
    public void run() {
        super.run();
        publicVar.setValue("B","BB");
    }
}
