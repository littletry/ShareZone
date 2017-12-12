package top.littletry.sharezone.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
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
 * @author LittleTry
 */
@Controller
@Api(value = "UserController", description = "用户接口")
public class UserController {
    @Autowired
    private UserService userService;

    /**
     * 用户登录接口
     * @param loginName
     * @param password
     */
    @ApiOperation(value = "用户登录接口")
    @RequestMapping(value = "/user/_login",method = RequestMethod.POST,produces = "application/json")
    public void login(@RequestParam("loginName") String loginName,@RequestParam("password") String password){

    }

    /**
     * 用户注册接口
     *
     * @param user
     */
    @ApiOperation(value = "用户注册接口")
    @RequestMapping(value = "/user/_register",method = RequestMethod.PUT,produces = "application/json")
    public void register(@RequestBody User user){
        userService.insertUser(user);
    }

}
