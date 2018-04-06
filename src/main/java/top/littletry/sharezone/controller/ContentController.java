package top.littletry.sharezone.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import top.littletry.sharezone.common.RestResponse;
import top.littletry.sharezone.model.Content;
import top.littletry.sharezone.service.ContentService;

import javax.servlet.http.HttpServletRequest;

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
    @ApiOperation(value = "上传视频",notes = "上传视频")
    @ResponseBody
    @RequestMapping(value = "/uploadVideo", method = RequestMethod.POST, produces = MediaType.MULTIPART_FORM_DATA_VALUE)
    public String videoUpload(
            HttpServletRequest request,
            @RequestParam("contentId") String contentId,
            @RequestParam("file")MultipartFile file) {
        boolean checkUpload = contentService.videoUpload(request,contentId,file);
        if (checkUpload) {
            return "success";
        } else {
            return "error";
        }
    }
    @ApiOperation(value = "上传一张或多张图片",notes = "上传一张或多张图片")
    @ResponseBody
    @RequestMapping(value = "/uploadImage", method = RequestMethod.POST, produces = MediaType.MULTIPART_FORM_DATA_VALUE)
    public String imageUpload(
            HttpServletRequest request,
            @RequestParam("contentId") String contentId,
            @RequestParam("file")MultipartFile[] files) {
        boolean checkUpload = contentService.imageUpload(request,contentId,files);
        if (checkUpload) {
            return "success";
        } else {
            return "error";
        }
    }
    @ApiOperation(value = "根据用户查询用户所发表的分享内容",notes = "根据用户查询用户所发表的分享内容")
    @ResponseBody
    @RequestMapping(value = "/select", method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
    public RestResponse selectByUserId(
            @RequestParam String userId) {
        return RestResponse.success(contentService.selectByUserId(userId));
    }
    @ApiOperation(value = "查询所有分享内容",notes = "查询所有分享内容")
    @ResponseBody
    @RequestMapping(value = "/all", method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
    public RestResponse selectAll() {
        return RestResponse.success(contentService.selectAll());
    }
}
