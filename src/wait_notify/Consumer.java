package wait_notify;

/**
 * @Auther: qulingxiao
 * @Date: 2020/4/25 11:16
 * @Description:
 */
public class Consumer {
    private String lock;
    public Consumer (String lock) {
        super();
        this.lock = lock;
    }
    public void getValue() {
        try {
            synchronized (lock) {
                if(ValueObect.value.equals("")) {
                    lock.wait();
                }
                System.out.println("get value is: "+ValueObect.value);
                ValueObect.value = "";
                lock.notify();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
