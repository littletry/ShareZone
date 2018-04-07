package top.littletry.sharezone.common;

import com.xiaoleilu.hutool.crypto.digest.DigestUtil;
import com.xiaoleilu.hutool.date.DateUtil;

import java.util.UUID;

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

        SQL();
    }
    public static void SQL(){
        for (int i = 0; i < 20; i++) {
            String Id = UUID.randomUUID().toString();
            System.out.print("INSERT INTO `sharezone`.`content` (`id`, `title`, `detail`, `create_time`, `image_url`, `video_url`, `user_id`) VALUES ('"+Id+"', 'linux"+Id+"', '详细信息"+Id+"', '2018-04-06 18:07:38', '/abc/inage.jpg', '/abc/inage.mp4', '1');\n");
        }
    }
}
