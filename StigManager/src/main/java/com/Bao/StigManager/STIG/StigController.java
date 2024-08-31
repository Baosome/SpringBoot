package com.Bao.StigManager.STIG;

import com.Bao.StigManager.System.SystemEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.Bao.StigManager.Repositories.SystemRepository;

@Controller
@SessionAttributes("name")
public class StigController {

    private final SystemRepository systemRepository;

    public StigController(SystemRepository systemRepository) {
        this.systemRepository = systemRepository;
    }

    @RequestMapping(value = "system", method=RequestMethod.GET)
    public String showUpdateTodoPage(@RequestParam int id, ModelMap model) {
        var mySystem = systemRepository.findById(id).get();
        System.out.println(mySystem);
        model.addAttribute("system", mySystem);
        return "SystemPage";
    }

}
