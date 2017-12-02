package top.littletry.sharezone.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import top.littletry.sharezone.model.User;

/**
 * Created by Intellij Idea
 * User：LittleTry
 * Date：2017/12/2
 * Time: 20:52
 *
 * @author LittleTry
 */
@Controller
public class User1Controller {
    private static final Log logger = LogFactory.getLog(User1Controller.class);
    //@ModelAttribute修饰的方法会先于login调用，该方法用于接收前台jsp页面传入的参数
    @ModelAttribute
    public void userMode1(String loginname, String password, Model model){
        logger.info("userMode1");
        //创建User对象存储jsp页面传入的参数
        User user = new User();
        user.setLoginname(loginname);
        user.setPassword(password);
        //将User对象添加到Model当中
        model.addAttribute("user",user);
    }
    @RequestMapping(value = "/login1")
    public String login(Model model){
        logger.info("login1");
        //从model对象当中取出之前存入的名为user的对象
        User user = (User) model.asMap().get("user");
        System.out.println(user);
        //设置user对象的username属性
        user.setUsername("测试");
        return "result1";
    }
}
