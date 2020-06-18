package suspend_resume;

/**
 * @Auther: qulingxiao
 * @Date: 2020/4/12 10:43
 * @Description: 使用suspend方法可以暂停线程，resume方法可以重新唤醒线程
 */
public class SuspendResumeRun {
    public static void main(String[] args) {
        try {
            Mythread mythread = new Mythread();
            mythread.start();
            Thread.sleep(5000);

            //suspend线程
            mythread.suspend();
            System.out.println("suspend: "+System.currentTimeMillis() + "i = " + mythread.getI());
            Thread.sleep(5000);
            System.out.println("suspend: "+System.currentTimeMillis() + "i = " + mythread.getI());

            //resume线程
            mythread.resume();
            Thread.sleep(5000);
            System.out.println("resume: "+System.currentTimeMillis() + "i = " + mythread.getI());
            Thread.sleep(5000);
            System.out.println("resume: "+System.currentTimeMillis() + "i = " + mythread.getI());

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
