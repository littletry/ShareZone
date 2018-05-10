package top.littletry.sharezone.controller;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;
import org.springframework.web.multipart.MultipartFile;
import top.littletry.sharezone.common.RestResponse;
import top.littletry.sharezone.model.Content;
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
@RequestMapping(value = "/content", produces = MediaType.APPLICATION_JSON_VALUE)
public class ContentController {

    @Autowired
    private IContentService contentService;

    @ApiOperation(value = "提交分享内容",notes = "提交分享内容")
    @ResponseBody
    @RequestMapping(value = "/commit", method = RequestMethod.POST)
    public RestResponse<String> commit(@RequestBody Content content) {
        String contentId = contentService.insertContent(content, content.getUserId());
        if (contentId.length() > 0) {
            return RestResponse.success(contentId);
        } else {
            return RestResponse.failed("提交失败，请重新提交");
        }
    }

    @ApiOperation(value = "根据用户id查询用户所发表的分享内容",notes = "根据用户id查询用户所发表的分享内容")
    @ResponseBody
    @RequestMapping(value = "/select", method = RequestMethod.POST)
    public RestResponse selectByUserId(
            @RequestParam String userId,
            @RequestParam int page) {
        return RestResponse.success(contentService.selectByUserId(userId, page));
    }

    @ApiOperation(value = "管理员查询所有分享内容",notes = "管理员查询所有分享内容")
    @ResponseBody
    @RequestMapping(value = "/all", method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
    public RestResponse selectAll(
            @RequestParam int page) {
        return RestResponse.success(contentService.selectAll(page));
    }

    @ApiOperation(value = "用户查询所有分享内容",notes = "用户查询所有分享内容")
    @ResponseBody
    @RequestMapping(value = "/userAll", method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
    public RestResponse userSelectAll(
            @RequestParam int page) {
        return RestResponse.success(contentService.userSelectAll(page));
    }

    @ApiOperation(value = "修改审核状态", notes = "修改审核状态")
    @ResponseBody
    @RequestMapping(value = "/change", method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
    public RestResponse changeContent(@RequestParam String contentId, @RequestParam int checkPublish) {
        boolean changeContent = contentService.changeContent(contentId, checkPublish);
        if (changeContent) {
            return RestResponse.success("审核成功");
        } else {
            return RestResponse.failed("审核失败");
        }
    }
}

