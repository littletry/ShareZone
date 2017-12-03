package top.littletry.sharezone.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import top.littletry.sharezone.model.User;

/**
 * Created by Intellij Idea
 * User：LittleTry
 * Date：2017/12/3
 * Time: 18:10
 *
 * @author LittleTry
 */
@Controller
@SessionAttributes("user")
@RequestMapping(value = "/SessionAttributes")
public class SessionAttributesController {
    private static final Log logger = LogFactory.getLog(SessionAttributesController.class);
    @RequestMapping(value = "/loginForm")
    public String login(){
        return "loginForm";

    }
    @RequestMapping(value = "/login")
    public String login(
            @RequestParam("loginname") String loginname,
            @RequestParam("password") String password,
            Model model){
        User user = new User();
        user.setLoginname(loginname);
        user.setPassword(password);
        user.setUsername("admin");

        model.addAttribute("user",user);
        return "welcome";
    }
}
