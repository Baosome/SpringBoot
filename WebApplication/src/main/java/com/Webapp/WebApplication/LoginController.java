package com.Webapp.WebApplication;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
    //JSP java solo pages
    @RequestMapping("/Login")
    public String sayHelloJsp(){
        return "Login";
    }

}
