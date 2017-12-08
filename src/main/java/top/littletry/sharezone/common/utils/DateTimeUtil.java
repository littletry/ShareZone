package top.littletry.sharezone.common.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by LittleTry
 * Date: 2017-12-04
 * Time: 13:52
 *
 * @author LittleTry
 */
public class DateTimeUtil {
    /**
     * 时间格式转换成时间字符串
     *
     * @param date
     * @return
     */
    public static String convert2String(Date date) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return format.format(date);
    }

    /**
     * 时间字符串转换成时间格式
     *
     * @param source
     * @return
     */
    public static Date convert2Date(String source) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            return format.parse(source);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }
}
