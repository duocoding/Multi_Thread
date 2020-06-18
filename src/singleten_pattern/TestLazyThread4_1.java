package singleten_pattern;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Auther: qulingxiao
 * @Date: 2020/5/18 16:54
 * @Description:
 */
public class TestLazyThread4_1 {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(3);

        for(int i=0; i<3; i++) {
            executorService.execute( () -> {
                try {
                    System.out.println(LazyPattern2.getInstance().hashCode());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }
        executorService.shutdown();
    }
}
