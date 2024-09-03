package com.Bao.StigManager.Component;

import com.Bao.StigManager.Repositories.ComponentRepository;
import com.Bao.StigManager.Repositories.StigsRepository;
import com.Bao.StigManager.STIG.StigEntity;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
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
        //Find System ID
        var mySystem = systemRepository.findById(id).get();
        model.addAttribute("system", mySystem);

        //Set up Repository
        List<ComponentEntity> hardwares = componentRepository.findByeMassIdAndComponentType(id, "Hardware");
        List<ComponentEntity> softwares = componentRepository.findByeMassIdAndComponentType(id, "Software");
        List<StigEntity> stigs = stigsRepository.findByEMassId(0);

        //Add list to jsp
        model.addAttribute("Hardwares", hardwares);
        model.addAttribute("Softwares", softwares);
        model.addAttribute("Stigs", stigs);

        //Set up classes for POST
        ComponentEntity componentEntity = new ComponentEntity(0, 0,
                "", "", "", null);
        model.addAttribute("component", componentEntity);

        return "SystemPage";
    }

    @RequestMapping(value = "system", method=RequestMethod.POST)
    public String UpdateComponent(ModelMap model,@RequestParam int id, @Valid ComponentEntity component, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) return "/";
        int numOfComponents = (int) componentRepository.count() + 1;
        component.setComponentId(numOfComponents);
        component.seteMassId(id);
        System.out.println(component);
        return "redirect:/system?id=" + id;
    }

}
