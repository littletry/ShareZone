package top.littletry.sharezone.controller;


import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import top.littletry.sharezone.common.RestResponse;
import top.littletry.sharezone.model.User;
import top.littletry.sharezone.service.IUserService;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author littletry
 * @since 2018-04-06
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @ApiOperation(value = "用户注册",notes = "用户注册")
    @ResponseBody
    @RequestMapping(value = "/_register", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public RestResponse<String> register(
            @RequestBody User user) {

        boolean exist = userService.insertUser(user);
        if (exist) {
            return RestResponse.success("用户注册成功");
        } else {
            return RestResponse.failed("用户已存在");
        }

    }
}
