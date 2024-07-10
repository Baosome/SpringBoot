package com.Webapp.WebApplication;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @RequestMapping("/Hello")
    @ResponseBody
    public String sayHello(){
        return "Hello! friends";
    }

    @RequestMapping("Hello-Html")
    @ResponseBody
    public String sayHelloHtml(){
        StringBuffer sb = new StringBuffer();
        sb.append("<html>");
        sb.append("<head>");
        sb.append("<title> MY TITLE </title>");
        sb.append("</head>");
        sb.append("<body>");
        sb.append("<h2>");
        sb.append("Test");
        sb.append("</h2>");
        sb.append("</body>");
        sb.append("</html>");

        return sb.toString();
        
    }

    //JSP java solo pages
    @RequestMapping("/Hello-Jsp")
    public String sayHelloJsp(){
        return "sayHello";
    }

}
