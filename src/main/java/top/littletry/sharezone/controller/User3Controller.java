package top.littletry.sharezone.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import top.littletry.sharezone.model.User;

/**
 * Created by Intellij Idea
 * User：LittleTry
 * Date：2017/12/2
 * Time: 22:26
 *
 * @author LittleTry
 */
@Controller
public class User3Controller {
    private static final Log logger = LogFactory.getLog(User3Controller.class);
    @ModelAttribute
    public void userMode3(String loginname, String password, ModelAndView mv){
        logger.info("userMode3");
        User user = new User();
        user.setLoginname(loginname);
        user.setPassword(password);
        mv.addObject("user",user);
    }
    @RequestMapping(value = "/login3")
    public ModelAndView login3(ModelAndView mv){
        logger.info("login3");
        User user = (User) mv.getModel().get("user");
        System.out.println(user);
        user.setUsername("测试");
        return mv;
    }
}
