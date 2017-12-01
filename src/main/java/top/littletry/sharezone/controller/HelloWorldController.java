package top.littletry.sharezone.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Intellij Idea
 * User：TryLittle
 * Date：2017/12/1
 * Time:22:32
 */
@Controller
public class HelloWorldController {
    @RequestMapping(value = "/helloWorld")
    public String helloWorld(Model model){
        model.addAttribute("message","Hello World!");
        return "welcome";
    }
}
