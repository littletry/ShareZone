package top.littletry.sharezone.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Intellij Idea
 * User：LittleTry
 * Date：2017/12/3
 * Time: 21:06
 *
 * @author LittleTry
 */
@Controller
public class ModelAttribute1Controller {
    @ModelAttribute("loginname")
    public String userMode1(
            @RequestParam("loginname") String loginname){
        return loginname;
    }
    @RequestMapping(value = "/login1")
    public String login1(){
        return "result1";
    }
}
