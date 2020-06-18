package wait_notify;

/**
 * @Auther: qulingxiao
 * @Date: 2020/4/25 11:23
 * @Description:
 */
public class Run {
    public static void main(String[] args) {
        String lock = "";
        Productor productor = new Productor(lock);
        Consumer consumer = new Consumer(lock);
        ThreadP threadP = new ThreadP(productor);
        ThreadC threadC = new ThreadC(consumer);
        threadP.start();
        threadC.start();
    }
}
