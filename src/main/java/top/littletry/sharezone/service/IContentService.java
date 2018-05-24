package top.littletry.sharezone.service;

import top.littletry.sharezone.model.Content;
import com.baomidou.mybatisplus.service.IService;
import top.littletry.sharezone.model.ContentDto;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author littletry
 * @since 2018-04-06
 */
public interface IContentService extends IService<Content> {

    /**
     * 插入一条分享内容
     * @param content
     * @param userId
     * @return
     */
    String insertContent(Content content, String userId);

    /**
     * 根据用户id查询用户所发表的分享内容
     * @param userId
     * @param page
     * @return
     */
    List<Content> selectByUserId(String userId,int page);

    /**
     * 管理员查询所有分享内容
     * @param page
     * @return
     */
    List<ContentDto> selectAll(int page);

    /**
     * 用户查询所有分享内容
     * @param page
     * @return
     */
    List<ContentDto> userSelectAll(int page);
    /**
     * 修改审核状态
     * @param contentId
     * @param checkPublish
     * @return
     */
    boolean changeContent(String contentId, int checkPublish);

}
