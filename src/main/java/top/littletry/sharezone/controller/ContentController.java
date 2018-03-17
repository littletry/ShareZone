package top.littletry.sharezone.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import top.littletry.sharezone.common.dto.RestResponse;
import top.littletry.sharezone.model.Content;
import top.littletry.sharezone.service.ContentService;

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
    @RequestMapping(value = "/_commit", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public RestResponse<String> commit(@RequestBody Content content) {

        boolean checkContent = contentService.insertContent(content);
        if (checkContent) {
            return RestResponse.success("发表成功");
        } else {
            return RestResponse.failed("发表失败，内容包含敏感词汇");
        }
    }

}
