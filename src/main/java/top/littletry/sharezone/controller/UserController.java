package top.littletry.sharezone.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.Api;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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

}
