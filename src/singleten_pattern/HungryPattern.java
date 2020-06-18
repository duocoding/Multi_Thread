package singleten_pattern;

/**
 * @Auther: qulingxiao
 * @Date: 2020/5/10 21:41
 * @Description:
 */
public class HungryPattern {

    private static HungryPattern hungryPattern = new HungryPattern();

    private HungryPattern(){
    }

    public static HungryPattern getInstance() {
        return hungryPattern;
    }


}
