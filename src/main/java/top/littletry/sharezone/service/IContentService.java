package top.littletry.sharezone.service;

import org.springframework.web.multipart.MultipartFile;
import top.littletry.sharezone.model.Content;
import com.baomidou.mybatisplus.service.IService;

import javax.servlet.http.HttpServletRequest;

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

}
