package top.littletry.sharezone.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Intellij Idea
 * User：LittleTry
 * Date：2017/12/3
 * Time: 20:59
 *
 * @author LittleTry
 */
@Controller
public class FormController {
    @RequestMapping(value = "/{formName}")
    public String loginForm(@PathVariable String formName) {
        //动态跳转页面
        return formName;
    }
}
