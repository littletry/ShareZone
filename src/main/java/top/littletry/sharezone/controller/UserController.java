package top.littletry.sharezone.controller;


import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;
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

    @ApiOperation(value = "用户登录",notes = "用户登录")
    @ResponseBody
    @RequestMapping(value = "/_login", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public RestResponse<String> login(
            @RequestParam("loginName") String loginName,
            @RequestParam("password") String password) {
        boolean checkUser = userService.selectUser(loginName, password);
        if (checkUser) {
            return RestResponse.success("用户登录成功");
        } else {
            return RestResponse.failed("登录失败，请检查用户名或密码");
        }
    }

    @ApiOperation(value = "用户密码更新",notes = "用户密码更新")
    @ResponseBody
    @RequestMapping(value = "/_resetPassword", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public RestResponse<String> update(
            @RequestParam("loginName") String loginName,
            @RequestParam("oldPassword") String oldPassword,
            @RequestParam("newPassword") String newPassword) {
        boolean updateUser = userService.updateUser(loginName, oldPassword, newPassword);
        if (updateUser) {
            return RestResponse.success("密码修改成功，请登录");
        } else {
            return RestResponse.failed("密码修改失败，请检查用户名或原密码是否正确");
        }
    }
}
