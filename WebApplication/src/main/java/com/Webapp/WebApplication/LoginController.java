package com.Webapp.WebApplication;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    private AuthenticationService authenticationService;

    public LoginController(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    @RequestMapping(value= "/Login", method = RequestMethod.GET)
    public String sayHelloJsp(){
        return "Login";
    }

    @RequestMapping(value= "/Login", method = RequestMethod.POST)
    public String WelcomePage(@RequestParam String name, @RequestParam String password, ModelMap model){
        model.put("name", name);
        model.put("password", password);

        //Authentication -> Name: Bao, Password: Password
        if (authenticationService.authenticate(name, password)) {
            return "Welcome";
        }
        model.put("Error", "Invalid Credential!");
        return "Login";
    }

}
