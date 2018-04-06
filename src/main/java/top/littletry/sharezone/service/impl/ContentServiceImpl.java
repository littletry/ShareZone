package top.littletry.sharezone.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import top.littletry.sharezone.dao.ContentMapper;
import top.littletry.sharezone.model.Content;
import top.littletry.sharezone.model.ContentQuery;
import top.littletry.sharezone.service.ContentService;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by LittleTry
 * Date: 2017-12-29
 * Time: 15:57
 *
 * @author LittleTry
 */
@Service("contentService")
public class ContentServiceImpl implements ContentService{

    @Autowired
    private ContentMapper contentMapper;

    /**
     * 插入一条分享内容
     * @param content
     */
    @Override
    public boolean insertContent(Content content) {

        //TODO 对分享内容进行检测，调用外部工具包检测内容是否包含敏感词汇

        return true;
    }

    /**
     * 上传视频文件
     * @param request
     * @param contentId
     * @param file
     * @return
     */
    @Override
    public boolean videoUpload(HttpServletRequest request, String contentId, MultipartFile file){
        boolean checkUpload = false;
        try {
            //如果文件不为空，写入上传路径
            if (!file.isEmpty()){
                //上传文件路径
                String path = request.getServletContext().getRealPath("/" + contentId + "/videos/");
                //上传文件名
                String filename = file.getOriginalFilename();
                File filepath = new File(path,filename);
                //判断路径是否存在，如果不存在就创建一个
                if (!filepath.getParentFile().exists()){
                    filepath.getParentFile().mkdirs();
                }
                //将上传文件保存到一个目标文件当中
                String resultPath = path + File.separator + filename;
                file.transferTo(new File(resultPath));
                checkUpload = true;

                //把视频url存到数据库对应分享内容的位置
//                ContentQuery contentQuery = new ContentQuery();
//                contentQuery.createCriteria().andIdEqualTo(contentId);
//                List<Content> contents = contentMapper.selectByExample(contentQuery);
//                Content content = contents.get(0);
//                content.setVideoUrl(resultPath);
//                contentMapper.updateByPrimaryKey(content);

            }else {
                checkUpload = false;
            }
        }catch (Exception e){
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
    public boolean imageUpload(HttpServletRequest request, String contentId, MultipartFile[] files){
        boolean checkUpload = false;
        List<String> lists = new ArrayList<String>();
        try {
            //如果文件不为空，写入上传路径
            for (MultipartFile mul: files) {
                if (!mul.isEmpty()){
                    //上传文件路径
                    String path = request.getServletContext().getRealPath("/" + contentId + "/images/");
                    //上传文件名
                    String filename = mul.getOriginalFilename();
                    File filepath = new File(path,filename);
                    //判断路径是否存在，如果不存在就创建一个
                    if (!filepath.getParentFile().exists()){
                        filepath.getParentFile().mkdirs();
                    }
                    //将上传文件保存到一个目标文件当中
                    String resultPath = path + File.separator + filename;
                    mul.transferTo(new File(resultPath));
                    //将当前图片的url添加到list数组中
                    lists.add(resultPath);

                    checkUpload = true;
                }else {
                    checkUpload = false;
                }
            }
            //把图片url数组存到数据库对应分享内容的位置
//            ContentQuery contentQuery = new ContentQuery();
//            contentQuery.createCriteria().andIdEqualTo(contentId);
//            List<Content> contents = contentMapper.selectByExample(contentQuery);
//            Content content = contents.get(0);
//            content.setImageUrl(lists.toString());
//            contentMapper.updateByPrimaryKey(content);

        }catch (Exception e){
            e.printStackTrace();
        }
        return checkUpload;
    }
}
