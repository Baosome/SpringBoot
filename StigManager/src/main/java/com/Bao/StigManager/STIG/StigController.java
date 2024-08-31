package com.Bao.StigManager.STIG;

import com.Bao.StigManager.Component.ComponentEntity;
import com.Bao.StigManager.Repositories.ComponentRepository;
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
    private final ComponentRepository componentRepository;

    public StigController(SystemRepository systemRepository, ComponentRepository componentRepository) {
        this.systemRepository = systemRepository;
        this.componentRepository = componentRepository;
    }

    @RequestMapping(value = "system", method=RequestMethod.GET)
    public String showUpdateTodoPage(@RequestParam int id, ModelMap model) {
        var mySystem = systemRepository.findById(id).get();
        model.addAttribute("system", mySystem);
        ComponentEntity component = componentRepository.findById(id).get();
        model.addAttribute("Components", component);

        System.out.println(mySystem);
        System.out.println(component);
        return "SystemPage";
    }

}
