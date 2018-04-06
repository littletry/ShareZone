package top.littletry.sharezone.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import top.littletry.sharezone.common.dto.RestResponse;
import top.littletry.sharezone.model.Content;
import top.littletry.sharezone.service.ContentService;

import javax.servlet.http.HttpServletRequest;
import java.io.File;

/**
 * Created by LittleTry
 * Date: 2017-12-29
 * Time: 15:59
 *
 * @author LittleTry
 */
@Controller
@Api(value = "ContentController",description = "分享内容相关接口")
@RequestMapping(value = "/content")
public class ContentController {
    @Autowired
    private ContentService contentService;

    @ApiOperation(value = "提交分享内容",notes = "提交分享内容")
    @ResponseBody
    @RequestMapping(value = "/commit", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public RestResponse<String> commit(@RequestBody Content content) {

        boolean checkContent = contentService.insertContent(content);
        if (checkContent) {
            return RestResponse.success("发表成功");
        } else {
            return RestResponse.failed("发表失败，内容包含敏感词汇");
        }
    }
    @ApiOperation(value = "上传单个文件",notes = "上传单个文件")
    @ResponseBody
    @RequestMapping(value = "/upload", method = RequestMethod.POST, produces = MediaType.MULTIPART_FORM_DATA_VALUE)
    public String singleUpload(
            HttpServletRequest request,
            @RequestParam("userId") String userId,
            @RequestParam("file")MultipartFile file) throws Exception {
        System.out.println(userId);
        //如果文件不为空，写入上传路径
        if (!file.isEmpty()){
            //上传文件路径
            String path = request.getServletContext().getRealPath("/images/");
            //上传文件名
            String filename = file.getOriginalFilename();
            File filepath = new File(path,filename);
            //判断路径是否存在，如果不存在就创建一个
            if (!filepath.getParentFile().exists()){
                filepath.getParentFile().mkdirs();
            }
            //将上传文件保存到一个目标文件当中
            file.transferTo(new File(path+File.separator+filename));
            return "success";
        }else {
            return "error";
        }

    }
    @ApiOperation(value = "上传多个文件",notes = "上传多个文件")
    @ResponseBody
    @RequestMapping(value = "/_upload", method = RequestMethod.POST, produces = MediaType.MULTIPART_FORM_DATA_VALUE)
    public String moreUpload(
            HttpServletRequest request,
            @RequestParam("userId") String userId,
            @RequestParam("file")MultipartFile[] files) throws Exception {
        System.out.println(userId);
        //如果文件不为空，写入上传路径
        for (MultipartFile mul: files) {
            if (!mul.isEmpty()){
                //上传文件路径
                String path = request.getServletContext().getRealPath("/images/");
                //上传文件名
                String filename = mul.getOriginalFilename();
                File filepath = new File(path,filename);
                //判断路径是否存在，如果不存在就创建一个
                if (!filepath.getParentFile().exists()){
                    filepath.getParentFile().mkdirs();
                }
                //将上传文件保存到一个目标文件当中
                mul.transferTo(new File(path+File.separator+filename));
                return "success";
            }else {
                return "error";
            }
        }
    return "null";
    }
}
