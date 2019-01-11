package com.lxy.controller;

import com.lxy.exception.UserNotFoundException;
import com.lxy.service.UserService;
import com.lxy.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
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

   @GetMapping(value = "/findById/{userId}")
   public String findById(@PathVariable("userId") int id, Model model){
        UserVO vo = userService.findById(id);
        if(vo == null){
            throw new UserNotFoundException();
        }
        model.addAttribute("user", vo);
        return "details";
   }

  /* @ExceptionHandler(UserNotFoundException.class)
   public String handerError(){
       return "error";
   }*/
}
