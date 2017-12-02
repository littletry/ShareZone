package top.littletry.sharezone.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import top.littletry.sharezone.model.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Intellij Idea
 * User：LittleTry
 * Date：2017/12/2
 * Time: 23:00
 *
 * @author LittleTry
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {
    private static List<User> users;
    public UserController(){
        super();
        users = new ArrayList<User>();
    }
    private static final Log logger = LogFactory.getLog(UserController.class);

    @RequestMapping(value = "/register",method = RequestMethod.GET)
    public String registerForm(){
        logger.info("register  GET方法被调用...");
        return "registerForm";
    }
    @RequestMapping(value = "register",method = RequestMethod.POST)
    public String register(
            @RequestParam("loginname") String loginname,
            @RequestParam("password") String password,
            @RequestParam("username") String username){
        logger.info("regieter POST方法被调用");
        User user = new User();
        user.setLoginname(loginname);
        user.setPassword(password);
        user.setUsername(username);

        users.add(user);

        return "loginForm";
    }
    @RequestMapping(value = "login")
    public String login(
            @RequestParam("loginname") String loginname,
            @RequestParam("password") String password,
            Model model){
        logger.info("登录名:" + loginname + " 密码:" +password);
        for (User user :
                users) {
            if (user.getLoginname().equals(loginname)
                    && user.getPassword().equals(password)){
                model.addAttribute("user",user);
                return "welcome";
            }
        }
        return "loginForm";

    }
}
