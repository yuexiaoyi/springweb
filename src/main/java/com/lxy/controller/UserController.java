package com.lxy.controller;

import com.lxy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public ModelAndView index(){
        ModelAndView mav = new ModelAndView();
        mav.addObject("userList",userService.listAll());
        mav.setViewName("home");
        return mav;
    }

   /* @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String index(Model model){
       model.addAttribute("userList",userService.listAll());
       return "home";
    }*/
}
