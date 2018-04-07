package top.littletry.sharezone.service;

import org.springframework.web.multipart.MultipartFile;
import top.littletry.sharezone.model.Content;
import com.baomidou.mybatisplus.service.IService;

import javax.servlet.http.HttpServletRequest;
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
     * 上传视频
     * @param request
     * @param contentId
     * @param file
     * @return
     */
    boolean videoUpload(HttpServletRequest request, String contentId, MultipartFile file);

    /**
     * 上传一张或多张图片
     * @param request
     * @param contentId
     * @param files
     * @return
     */
    boolean imageUpload(HttpServletRequest request, String contentId, MultipartFile[] files);

    /**
     * 插入一条分享内容
     * @param content
     * @return
     */
    boolean insertContent(Content content);

    /**
     * 根据用户id查询用户所发表的分享内容
     * @param userId
     * @param page
     * @return
     */
    public List<Content> selectByUserId(String userId,int page);

    /**
     * 查询所有分享内容
     * @return
     */
    public List<Content> selectAll(int page);

}
