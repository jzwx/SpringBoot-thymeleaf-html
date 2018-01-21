package com.jzwx.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * PageController
 *
 * @author Administrator
 * @version $ Id: PageController, v 0.1 2018/1/20 18:18 Administrator Exp $
 */
@Controller
@RequestMapping(value = "/thymeleaf")
public class PageController {
    /**
     * 测试
     * @return
     */
    @RequestMapping(value = "/init",method = {RequestMethod.GET,RequestMethod.POST})
    public @ResponseBody String hello(){
        return "hello world!";
    }

    /***
     * 首页
     */
    @RequestMapping(value = "/main",method = {RequestMethod.GET,RequestMethod.POST})
    public String page(){
        return "system/index";
    }

    /**
     * 跳转
     */
    @RequestMapping(value = "/redirect",method = {RequestMethod.GET,RequestMethod.POST})
    public String page2(){
        return "redirect/thymeleaf/redirect";
    }

    /**
     * 视图
     */
    @RequestMapping(value = "/model",method = {RequestMethod.GET,RequestMethod.POST})
    public String page3(Model model){
        model.addAttribute("name","seawater");
        return "/thymeleaf/hello";
    }
}
