package suspend_resume;


/**
 * @Auther: qulingxiao
 * @Date: 2020/4/12 10:40
 * @Description:
 */
public class Mythread extends Thread{
    private long i = 0;
    public long getI () {
        return i;
    }
    public void setI (long i){
        this.i = i;
    }

    @Override
    public void run() {
        while (true) {
            i++;
        }
    }
}
