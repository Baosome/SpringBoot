package com.Bao.StigManager.Component;

import com.Bao.StigManager.Repositories.ComponentRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.Bao.StigManager.Repositories.SystemRepository;

import java.util.List;

@Controller
@SessionAttributes("name")
public class ComponentController {

    private SystemRepository systemRepository;
    private ComponentRepository componentRepository;

    public ComponentController(SystemRepository systemRepository, ComponentRepository componentRepository) {
        this.systemRepository = systemRepository;
        this.componentRepository = componentRepository;
    }

    @RequestMapping(value = "system", method=RequestMethod.GET)
    public String showUpdateTodoPage(@RequestParam int id, ModelMap model) {
        var mySystem = systemRepository.findById(id).get();
        model.addAttribute("system", mySystem);

        List<ComponentEntity> hardwares = componentRepository.findByeMassIdAndComponentType(id, "Hardware");
        List<ComponentEntity> softwares = componentRepository.findByeMassIdAndComponentType(id, "Software");

        model.addAttribute("Hardwares", hardwares);
        model.addAttribute("Softwares", softwares);

//        System.out.println(mySystem);
//        System.out.println(components);
        return "SystemPage";
    }

}
