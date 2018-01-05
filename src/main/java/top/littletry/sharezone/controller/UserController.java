package top.littletry.sharezone.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import top.littletry.sharezone.common.dto.RestResponse;
import top.littletry.sharezone.model.User;
import top.littletry.sharezone.service.UserService;

import javax.annotation.Resource;
import javax.security.auth.login.LoginException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

/**
 * Created by LittleTry
 * Date: 2017-11-29
 * Time: 14:24
 *
 * @author LittleTry
 */
@Controller
@Api(value = "UserController", description = "用户接口")
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    private UserService userService;

    /**
     * 用户登录接口
     *
     * @param loginName
     * @param password
     */
    @ApiOperation(value = "用户登录接口")
    @ResponseBody
    @RequestMapping(value = "/_login", method = RequestMethod.POST, produces = "application/json")
    public RestResponse<String> login(@RequestParam("loginName") String loginName, @RequestParam("password") String password) {
        boolean checkUser = userService.selectUser(loginName, password);
        if (checkUser) {
            return RestResponse.success("用户登录成功");
        } else {
            return RestResponse.failed("登录失败，请检查用户名或密码");
        }
    }

    /**
     * 用户注册接口
     *
     * @param user
     */
    @ApiOperation(value = "用户注册接口")
    @ResponseBody
    @RequestMapping(value = "/_register", method = RequestMethod.POST, produces = "application/json")
    public RestResponse<String> register(@RequestBody User user) {

        userService.insertUser(user);

        return RestResponse.success("用户注册成功");
    }

}
