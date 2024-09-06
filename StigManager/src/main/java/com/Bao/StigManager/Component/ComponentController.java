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

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

        //Stigs model for radio buttons
        Map<String, Boolean> StigMap = new HashMap<String, Boolean>();
        for (StigEntity stig : stigs) {
            if (stig.geteMassId() == 0) {
                StigMap.put(stig.getStigId() + stig.getName(), false);
            }
        }

        //Add list to jsp
        model.addAttribute("Hardwares", hardwares);
        model.addAttribute("Softwares", softwares);
        model.addAttribute("Stigs", stigs);
        model.addAttribute("StigMap", StigMap);

        //Set up classes for POST
        ComponentEntity componentEntity = new ComponentEntity(0, 0,
                "", "", "", null);
        model.addAttribute("component", componentEntity);

        return "SystemPage";
    }

    @RequestMapping(value = "system", method=RequestMethod.POST)
    public String UpdateComponent(ModelMap model,@RequestParam int id, @Valid ComponentEntity component,
                                  @Valid HashMap<String, Integer> StigsMap, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) return "/";

        if (component != null) {
            int numOfComponents = (int) componentRepository.count() + 1;
            component.setComponentId(numOfComponents);
            component.seteMassId(id);
            componentRepository.save(component);
            System.out.println(component);
        }

        /*
            TODO: Add Stig map form to jsp
            Post for stig map
            Match with stig id and stig name
            Update page to show which stig is selected
            Update stig counter
         */

        if (StigsMap != null) {
            System.out.println(StigsMap);
        }


        return "redirect:/system?id=" + id;
    }

}
