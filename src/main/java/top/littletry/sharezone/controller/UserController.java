package top.littletry.sharezone.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import top.littletry.sharezone.common.RestResponse;
import top.littletry.sharezone.model.User;
import top.littletry.sharezone.service.UserService;

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

    /**
     * 用户注册接口
     *
     * @param user
     */
    @ApiOperation(value = "用户注册",notes = "用户注册")
    @ResponseBody
    @RequestMapping(value = "/_register", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public RestResponse<String> register(
            @RequestBody User user) {

        userService.insertUser(user);

        return RestResponse.success("用户注册成功");
    }

    /**
     * 用户密码更新接口
     * @param loginName
     * @param oldPassword
     * @param newPassword
     * @return
     */
    @ApiOperation(value = "用户密码更新",notes = "用户密码更新")
    @ResponseBody
    @RequestMapping(value = "/_resetPassword",method = RequestMethod.PUT,produces = MediaType.APPLICATION_JSON_VALUE)
    public RestResponse<String> update(
            @RequestParam("loginName") String loginName,
            @RequestParam("oldPassword") String oldPassword,
            @RequestParam("newPassword") String newPassword){

        boolean updateState = userService.updateUser(loginName,oldPassword,newPassword);

        if (updateState){
            return RestResponse.success("密码修改成功，请登录");
        }else {
            return RestResponse.failed("密码修改失败，请检查原密码是否正确");
        }
    }

}
