package com.Bao.StigManager.Component;

import com.Bao.StigManager.Repositories.ComponentRepository;
import com.Bao.StigManager.Repositories.StigsRepository;
import com.Bao.StigManager.STIG.StigEntity;
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
    private StigsRepository stigsRepository;

    public ComponentController(SystemRepository systemRepository, ComponentRepository componentRepository, StigsRepository stigsRepository) {
        this.systemRepository = systemRepository;
        this.componentRepository = componentRepository;
        this.stigsRepository = stigsRepository;
    }

    @RequestMapping(value = "system", method=RequestMethod.GET)
    public String showUpdateTodoPage(@RequestParam int id, ModelMap model) {
        var mySystem = systemRepository.findById(id).get();
        model.addAttribute("system", mySystem);

        List<ComponentEntity> hardwares = componentRepository.findByeMassIdAndComponentType(id, "Hardware");
        List<ComponentEntity> softwares = componentRepository.findByeMassIdAndComponentType(id, "Software");
        List<StigEntity> stigs = stigsRepository.findByEMassId(0);

        model.addAttribute("Hardwares", hardwares);
        model.addAttribute("Softwares", softwares);
        model.addAttribute("Stigs", stigs);

//        System.out.println(mySystem);
//        System.out.println(components);
        return "SystemPage";
    }

}
