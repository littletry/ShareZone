package top.littletry.sharezone.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.multipart.MultipartFile;
import top.littletry.sharezone.model.Content;
import top.littletry.sharezone.dao.ContentMapper;
import top.littletry.sharezone.service.IContentService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author littletry
 * @since 2018-04-06
 */
@Service
public class ContentServiceImpl extends ServiceImpl<ContentMapper, Content> implements IContentService {

    @Autowired
    private ContentMapper contentMapper;

    /**
     * 上传视频
     * @param request
     * @param contentId
     * @param file
     * @return
     */
    @Override
    public boolean videoUpload(HttpServletRequest request, String contentId, MultipartFile file) {
        boolean checkUpload = false;
        try {
            //如果文件不为空，写入上传路径
            if (!file.isEmpty()) {
                //上传路径
                String path = request.getServletContext().getRealPath("/" + contentId + "/videos/");
                //上传文件名
                String filename = file.getOriginalFilename();
                File filepath = new File(path, filename);
                //判断路径是否存在,如果不存在就创建一个
                if (!filepath.getParentFile().mkdirs()) {
                    filepath.getParentFile().mkdirs();
                }
                //将上传文件保存到一个目标文件当中
                String resultPath = path + File.separator + filename;
                file.transferTo(new File(resultPath));
                checkUpload = true;
                //把视频url保存到数据库对应分享内容的位置
//                List<Content> lists = contentMapper.selectList(
//                        new EntityWrapper<Content>().eq("id",contentId)
//                );
//                Content content = lists.get(0);
//                content.setVideoUrl(resultPath);
//                contentMapper.updateById(content);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return checkUpload;
    }

    /**
     * 上传一张或多张图片
     * @param request
     * @param contentId
     * @param files
     * @return
     */
    @Override
    public boolean imageUpload(HttpServletRequest request, String contentId, MultipartFile[] files) {
        boolean checkUpload = false;
        List<String> images = new ArrayList<>();
        try {
            //如果文件不为空，写入上传路径
            for (MultipartFile mul: files) {
                if (!mul.isEmpty()) {
                    //上传路径
                    String path = request.getServletContext().getRealPath("/" + contentId + "/images/");
                    //上传文件名
                    String filename = mul.getOriginalFilename();
                    File filepath = new File(path, filename);
                    //判断路径是否存在，如果不存在就创建一个
                    if (!filepath.getParentFile().mkdirs()) {
                        filepath.getParentFile().mkdirs();
                    }
                    //将上传文件保存到一个目标文件当中
                    String resultPath = path + File.separator + filename;
                    mul.transferTo(new File(resultPath));
                    //将当前图片的url添加到list数组中
                    images.add(resultPath);
                    checkUpload = true;
                } else {
                    checkUpload = false;
                }
            }
            //把图片url数组存到数据库对应分享内容的位置
            List<Content> lists = contentMapper.selectList(
                    new EntityWrapper<Content>().eq("id",contentId)
            );
            Content content = lists.get(0);
            content.setImageUrl(images.toString());
            contentMapper.updateById(content);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return checkUpload;
    }

    @Override
    public boolean insertContent(Content content, String userId) {

        //TODO 对分享内容进行检测，调用外部工具包检测内容是否包含敏感词汇，替换敏感词汇为*
        content.setUserId(userId);
        contentMapper.insert(content);

        return true;
    }

    /**
     * 根据用户id查询用户所发表的分享内容
     * @param userId
     * @return
     */
    @Override
    public List<Content> selectByUserId(String userId, int page) {
        List<Content> contents = contentMapper.selectPage(
                new Page<Content>(page,10),
                new EntityWrapper<Content>().eq("user_id", userId).orderBy("create_time",false)
        );
        return contents;
    }

    /**
     * 查询所有分享内容
     * @return
     */
    @Override
    public List<Content> selectAll(int page) {
        List<Content> contents = contentMapper.selectPage(
                new Page<Content>(page,10),
                new EntityWrapper<Content>().orderBy("create_time",false)
        );
        return contents;
    }

}
