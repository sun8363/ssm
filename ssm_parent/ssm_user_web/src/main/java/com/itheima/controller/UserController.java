package com.itheima.controller;



import com.itheima.domain.Users;
import com.itheima.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UsersService usersService;

    /**
     * @param user
     * @return
     */
    @RequestMapping("/user")
    public String add(Users user){
      int cnt = usersService.add(user);
      return "login";
    }

    @RequestMapping("sse")
    public String findById(Users users){

       Users use =  usersService.findById(users);
       return "success";
    }
}
