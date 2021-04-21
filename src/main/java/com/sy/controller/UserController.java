package com.sy.controller;

import com.sy.model.Result;
import com.sy.model.User;
import com.sy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.net.URLDecoder;
import java.net.URLEncoder;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService service;

    @RequestMapping("/login.do")
    public Result login(User user, HttpSession session, Result result) throws Exception{
        System.out.println(1);
        User findUser = service.findByLogin(user);
        if(findUser!=null){
//            String roleName= URLEncoder.encode(findUser.getRoleName(), "ISO-8859-1");
//            roleName= URLDecoder.decode(roleName, "UTF-8");
//            findUser.setRoleName(roleName);
            session.setAttribute("sessionUser", findUser);
            result.setData(findUser);
        }else {
            result.respError();
        }
        return result;
    }
}
