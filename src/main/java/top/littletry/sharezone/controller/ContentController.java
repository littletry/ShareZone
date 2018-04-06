package top.littletry.sharezone.controller;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import top.littletry.sharezone.service.IContentService;

import javax.servlet.http.HttpServletRequest;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author littletry
 * @since 2018-04-06
 */
@Controller
@Api(value = "ContentController", description = "分享内容接口")
@RequestMapping("/content")
public class ContentController {

    @Autowired
    private IContentService contentService;

    @ApiOperation(value = "上传视频", notes = "上传视频")
    @ResponseBody
    @RequestMapping(value = "/uploadVideo", method = RequestMethod.POST, produces = MediaType.MULTIPART_FORM_DATA_VALUE)
    public String videoUpload(
            HttpServletRequest request,
            @RequestParam("contentId") String contentId,
            @RequestParam("file")MultipartFile file) {
        boolean checkUpload = contentService.videoUpload(request, contentId, file);
        if (checkUpload) {
            return "success";
        } else {
            return "error";
        }
    }

}

