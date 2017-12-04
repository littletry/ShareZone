package top.littletry.sharezone.common;


import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.List;

/**
 * Created by LittleTry
 * Date: 2017-12-04
 * Time: 13:59
 *
 * @author LittleTry
 */
public class GsonUtils {
    private static Log log = LogFactory.getLog(GsonUtils.class);

    /**
     * 把json数据转换为指定的对象
     * @param jsonString
     * @param tClass
     * @param <T>
     * @return
     */
    public static <T> T parsePojo(String jsonString, Class<T> tClass) {
        T t = null;

        try {
            t = new Gson().fromJson(jsonString, tClass);
        } catch (Exception e) {
            log.error("parsePojo error！", e);
        }
        return t;
    }

    /**
     * 把json数据转换为指定的对象List集合
     * @param jsonString
     * @param <T>
     * @return
     */
    public static <T> List<T> parsePojoList(String jsonString) {
        List<T> tList = null;
        try {
            tList = new Gson().fromJson(jsonString, new TypeToken<List<T>>() {
            }.getType());
        } catch (Exception e) {
            log.error("parsePojoList error！", e);
        }
        return tList;
    }

    /**
     * 对象转成json字符串
     * @param o
     * @return
     */
    public static String writeValueAsString(Object o) {
        String jsonString = new Gson().toJson(o);
        return jsonString;
    }
}
