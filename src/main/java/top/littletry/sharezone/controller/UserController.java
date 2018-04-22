package top.littletry.sharezone.controller;


import com.xiaoleilu.hutool.crypto.digest.DigestUtil;
import com.xiaoleilu.hutool.util.ObjectUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;
import top.littletry.sharezone.common.RestResponse;
import top.littletry.sharezone.model.User;
import top.littletry.sharezone.model.UserDto;
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
@Api(value = "UserController", description = "用户接口")
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @ApiOperation(value = "用户注册",notes = "用户注册")
    @ResponseBody
    @RequestMapping(value = "/register", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public RestResponse<String> register(
            @RequestBody UserDto user) {

        boolean exist = userService.insertUser(user);
        if (exist) {
            return RestResponse.success("用户注册成功");
        } else {
            return RestResponse.failed("用户已存在");
        }

    }

    @ApiOperation(value = "用户登录",notes = "用户登录")
    @ResponseBody
    @RequestMapping(value = "/login", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public RestResponse login(
            @RequestParam("loginName") String loginName,
            @RequestParam("password") String password) {
        User checkUser = userService.selectUser(loginName, password);
        if (ObjectUtil.isNotNull(checkUser)) {
            return RestResponse.success(checkUser);
        } else {
            return RestResponse.failed("登录失败，请检查用户名或密码");
        }
    }

    @ApiOperation(value = "用户密码更新",notes = "用户密码更新")
    @ResponseBody
    @RequestMapping(value = "/resetPassword", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
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

    @ApiOperation(value = "管理员重置密码",notes = "管理员重置密码")
    @ResponseBody
    @RequestMapping(value = "/setPassword", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public RestResponse<String> setPassword(
            @RequestParam("userId") String userId,
            @RequestParam("newPassword") String newPassword) {
        User user = userService.selectById(userId);
        user.setPassword(DigestUtil.md5Hex(newPassword));
        userService.updateById(user);
        return RestResponse.success("密码重置成功");
    }

    @ApiOperation(value = "查询所有用户",notes = "查询所有用户")
    @ResponseBody
    @RequestMapping(value = "/all", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public RestResponse selectAll(@RequestParam int page) {
        return RestResponse.success(userService.selectAll(page));
    }

    @ApiOperation(value = "修改用户",notes = "修改用户")
    @ResponseBody
    @RequestMapping(value = "/change", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public RestResponse changeUser(@RequestBody User user) {
        boolean changeUser = userService.changeUser(user);
        if (changeUser) {
            return RestResponse.success("用户修改成功");
        } else {
            return RestResponse.failed("用户修改失败");
        }
    }

    @ApiOperation(value = "删除用户",notes = "删除用户")
    @ResponseBody
    @RequestMapping(value = "/delete",method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
    public RestResponse deleteUser(@RequestParam String userId) {
        boolean deleteUser = userService.deleteUser(userId);
        if (deleteUser) {
            return RestResponse.success("用户删除成功");
        } else {
            return RestResponse.failed("用户删除失败,此用户不存在");
        }
    }
}
