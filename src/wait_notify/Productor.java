package wait_notify;

/**
 * @Auther: qulingxiao
 * @Date: 2020/4/25 11:09
 * @Description:
 */
public class Productor {

    private String lock;
    public Productor(String lock){
        super();
        this.lock = lock;
    }
    public void setValue () {
        try {
            synchronized (lock) {
                if(!ValueObect.value.equals("")) {
                    lock.wait();
                }
                String value = System.currentTimeMillis() + "_" + System.nanoTime();
                System.out.println("set value is: "+value);
                ValueObect.value = value;
                lock.notify();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
