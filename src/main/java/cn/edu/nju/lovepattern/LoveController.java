package cn.edu.nju.lovepattern;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoveController {

    @RequestMapping("/home")
    public String hello(){
        return "home";
    }
}
