package cas;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicStampedReference;

/**
 * @ClassName Cas
 * @Description TODO
 * @Author qulingxiao
 * @Date 2020/11/14 11:30
 * @Version 1.0
 */
public class Cas{

    private static AtomicInteger atomicInt = new AtomicInteger(100);

    /**
     * avoid ABA
     */
    private static AtomicStampedReference<Integer> atomicStampedRef = new AtomicStampedReference<>(100, 0);

    public static void main(String[] args) throws InterruptedException {

        Runnable r1 = () -> {
            System.out.println("t1");
            atomicInt.compareAndSet(100, 101);
            atomicInt.compareAndSet(101, 100);
        };

        Runnable r2 = () -> {
            System.out.println("t2");
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            boolean b = atomicInt.compareAndSet(100, 101);
            System.out.println(b);
        };

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();
        t1.join();
        t2.join();


//        ----------------------Resolve ABA------------------------


        Thread t3 = new Thread( () -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            atomicStampedRef.compareAndSet(100, 101, atomicStampedRef.getStamp(), atomicStampedRef.getStamp()+1);
            atomicStampedRef.compareAndSet(101, 100, atomicStampedRef.getStamp(), atomicStampedRef.getStamp()+1);
        });

        Thread t4 = new Thread( () -> {
            int stamp = atomicStampedRef.getStamp();
            System.out.println("Before sleep : stamp = " + stamp);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("After sleep : stamp = " + atomicStampedRef.getStamp());
            boolean b = atomicStampedRef.compareAndSet(100, 101, stamp, stamp + 1);
            System.out.println(b);
        });

        t3.start();
        t4.start();
        t3.join();
        t4.join();
    }
}
