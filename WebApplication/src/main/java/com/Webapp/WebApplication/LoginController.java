package com.Webapp.WebApplication;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    private Logger logger = LoggerFactory.getLogger(getClass());

    //JSP java solo pages
    // ?name=Bao
    // Model -> Controller to JSP, Model map and add to it to use in JSP
    @RequestMapping("/Login")
    public String sayHelloJsp(@RequestParam String name, ModelMap model){
        model.put("name", name);
        logger.debug("Request Param is {}", name);
        logger.info("Info level {}", name);
        logger.warn("Warn level {}", name);
        return "Login";
    }

}
