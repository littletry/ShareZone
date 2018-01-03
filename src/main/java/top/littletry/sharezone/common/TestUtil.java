package top.littletry.sharezone.common;

import com.xiaoleilu.hutool.crypto.digest.DigestUtil;
import com.xiaoleilu.hutool.date.DateUtil;

/**
 * Created by Intellij Idea
 * User：LittleTry
 * Date：2017/12/12
 * Time: 22:08
 *
 * @author LittleTry
 */
public class TestUtil {

    public static void main(String[] args) {
        //md5摘要加密
        System.out.println(DigestUtil.md5Hex("123456"));

        //日期转换
        System.out.println(DateUtil.today());
        System.out.println(DateUtil.date().toString());



    }
}
