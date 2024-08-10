package com.Webapp.WebApplication;

import org.springframework.security.core.Authentication;
//import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class WelcomeController {

    // private AuthenticationService authenticationService;

    // public LoginController(AuthenticationService authenticationService) {
    //     this.authenticationService = authenticationService;
    // }

    @RequestMapping(value= "/", method = RequestMethod.GET)
    public String sayWelcomeJsp(ModelMap model){
        model.put("name", getLoggedUsername());
        return "Welcome";
    }

    private String getLoggedUsername() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        return authentication.getName();
    }

    // @RequestMapping(value= "/Login", method = RequestMethod.POST)
    // public String WelcomePage(@RequestParam String name, @RequestParam String password, ModelMap model){
    //     model.put("name", name);
    //     model.put("password", password);

    //     //Authentication -> Name: Bao, Password: Password
    //     if (authenticationService.authenticate(name, password)) {
    //         return "Welcome";
    //     }
    //     model.put("Error", "Invalid Credential!");
    //     return "Login";
    // }

}
