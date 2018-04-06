package top.littletry.sharezone.service;

import top.littletry.sharezone.model.Content;

/**
 * Created by LittleTry
 * Date: 2017-12-29
 * Time: 15:56
 *
 * @author LittleTry
 */
public interface ContentService {

    /**
     * 插入一条分享内容
     * @param content
     * @return
     */
    boolean insertContent(Content content);

}
