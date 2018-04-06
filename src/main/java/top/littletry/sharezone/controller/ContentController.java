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
import top.littletry.sharezone.common.RestResponse;
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

    @ApiOperation(value = "上传一张或多张图片", notes = "上传一张或多张图片")
    @ResponseBody
    @RequestMapping(value = "/uploadImage", method = RequestMethod.POST, produces = MediaType.MULTIPART_FORM_DATA_VALUE)
    public String imageUpload(
            HttpServletRequest request,
            @RequestParam("contentId") String contentId,
            @RequestParam("file")MultipartFile[] files) {
        boolean checkUpload = contentService.imageUpload(request, contentId, files);
        if (checkUpload) {
            return "success";
        } else {
            return "error";
        }
    }

    @ApiOperation(value = "根据用户id查询用户所发表的分享内容",notes = "根据用户id查询用户所发表的分享内容")
    @ResponseBody
    @RequestMapping(value = "/select", method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
    public RestResponse selectByUserId(
            @RequestParam String userId,
            @RequestParam int page) {
        return RestResponse.success(contentService.selectByUserId(userId, page));
    }
    @ApiOperation(value = "查询所有分享内容",notes = "查询所有分享内容")
    @ResponseBody
    @RequestMapping(value = "/all", method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
    public RestResponse selectAll(
            @RequestParam int page) {
        return RestResponse.success(contentService.selectAll(page));
    }

}

