package top.littletry.sharezone.service;

import org.springframework.web.multipart.MultipartFile;
import top.littletry.sharezone.model.Content;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

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

    /**
     * 上传单个文件
     * @param contentId
     * @param file
     * @return
     */
    public boolean videoUpload(HttpServletRequest request, String contentId, MultipartFile file);

    /**
     * 上传单个文件
     * @param contentId
     * @param file
     * @return
     */
    public boolean imageUpload(HttpServletRequest request, String contentId, MultipartFile[] file);

    /**
     * 根据用户查询用户所发表的分享内容
     * @param userId
     * @return
     */
    public List<Content> selectByUserId(String userId);

    /**
     * 查询所有分享内容
     * @return
     */
    public List<Content> selectAll();
}
