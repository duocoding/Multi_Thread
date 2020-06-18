package synchronized_test_4_19;

/**
 * @Auther: qulingxiao
 * @Date: 2020/4/19 09:44
 * @Description:
 */
public class PublicVar {
    public String userName = "A";
    public String userPwd = "AA";
    //实现方法同步
    synchronized public void setValue (String name,String pwd) {
        try {
            this.userName = name;
            Thread.sleep(5000);
            this.userPwd = pwd;
            System.out.println("setValue method thread name="+ Thread.currentThread().getName()
             + " userName=" + userName + " password= "+userPwd);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized public void getValue () {
        System.out.println("getValue method thread name="+ Thread.currentThread().getName()
                + " userName=" + userName + " password= "+userPwd);
    }
}
