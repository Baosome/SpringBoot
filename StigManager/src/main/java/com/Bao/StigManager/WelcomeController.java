package com.Bao.StigManager;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WelcomeController {

    @RequestMapping(value="/", method = RequestMethod.GET)
    public String Welcome(){
        return "WelcomePage";
    }

    /*
     * TODOS:
     *  Added user name
     *  Make user name persistance
     *  Add list of system to user name
     *  Thus need to fix system entity to incude username as key
     *  Add For Each table in welcome jsp
     * 
     */

}
