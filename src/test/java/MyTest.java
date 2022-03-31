import com.huarui.utils.MD5Util;
import com.huarui.utils.TimeUtil;
import org.junit.Test;

import java.util.Date;

/**
 * @author ：Ritchie Shao
 * @date ：Created in 2022/3/15 21:52
 * @description ：
 */
public class MyTest {

    private Date date;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Test
    public void MD5Test() {
        System.out.println (MD5Util.getMD5 ("3"));
        ;
    }

    @Test
    public void DateTest() {
        String strDate = "2020-04-06 00:00:00";
        System.out.println (TimeUtil.getDateByFormat (strDate, TimeUtil.dateFormatYMDHMS));//Mon Apr 06 00:00:00 CST 2020


    }

}
