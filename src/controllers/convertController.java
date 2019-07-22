package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class convertController {
    @GetMapping("/")
    public String index(){
        return "index";
    }
    @GetMapping ("/converting")
    public String concerting (@RequestParam double usd, @RequestParam double vnd, Model model){
        double result = usd * vnd;
        model.addAttribute("usd",usd);
        model.addAttribute("vnd",vnd);
        model.addAttribute("result",result);
        return "convert";
    }
}
