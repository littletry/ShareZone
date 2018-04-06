package top.littletry.sharezone.service.impl;

import org.springframework.stereotype.Service;
import top.littletry.sharezone.model.Content;
import top.littletry.sharezone.service.ContentService;

/**
 * Created by LittleTry
 * Date: 2017-12-29
 * Time: 15:57
 *
 * @author LittleTry
 */
@Service("contentService")
public class ContentServiceImpl implements ContentService{

    /**
     * 插入一条分享内容
     * @param content
     */
    @Override
    public boolean insertContent(Content content) {

        //TODO 对分享内容进行检测，调用外部工具包检测内容是否包含敏感词汇

        return true;
    }
}
