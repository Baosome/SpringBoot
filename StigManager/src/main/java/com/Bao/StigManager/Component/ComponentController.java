package com.Bao.StigManager.Component;

import com.Bao.StigManager.Repositories.ComponentRepository;
import com.Bao.StigManager.Repositories.StigsRepository;
import com.Bao.StigManager.STIG.StigEntity;
import com.Bao.StigManager.STIG.StigLists;
import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.Bao.StigManager.Repositories.SystemRepository;

import java.util.ArrayList;
import java.util.List;

@Controller
@SessionAttributes("name")
public class ComponentController {

    private final SystemRepository systemRepository;
    private final ComponentRepository componentRepository;
    private final StigsRepository stigsRepository;


    Logger logger = LoggerFactory.getLogger(ComponentController.class);

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
        List<StigEntity> myStigs = stigsRepository.findByEMassId(id);
        StigLists SystemStigs = new StigLists(myStigs, "");


        //Add list to jsp
        model.addAttribute("Hardwares", hardwares);
        model.addAttribute("Softwares", softwares);
        model.addAttribute("Stigs", stigs);
        model.addAttribute("myStigs", SystemStigs);

        //Set up classes for POST
        ComponentEntity componentEntity = new ComponentEntity(0, 0,
                "", "", "", null);
        model.addAttribute("component", componentEntity);

        model.addAttribute("StigList", new StigLists(stigs, ""));

        return "SystemPage";
    }

    @RequestMapping(value = "system", method=RequestMethod.POST)
    public String UpdateComponent(@RequestParam int id, @Valid ComponentEntity component, @Valid StigLists stiglist, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) return "/";

        if (!stiglist.getMyStigList().isEmpty()) {
            logger.info(stiglist.toString()); // What is returned
            for (StigEntity stig : stiglist.getMyStigList()) {
                int numOfStigs = (int) stigsRepository.count() +1;
                StigEntity newStig = new StigEntity(numOfStigs, id, stiglist.getComponentName(), stig.getName(), stig.getVersion(), stig.getRelease());
//                logger.info(newStig.toString());
                stigsRepository.save(newStig);
            }
        }
        /*
            TODO:
            [X] Fix component name concat issues
            [X] Badges now shows up for all components when added
            [X] Counter for badge
        */

        if (component.getName() != null) {
            int numOfComponents = (int) componentRepository.count() + 1;
            component.setComponentId(numOfComponents);
            component.seteMassId(id);
            componentRepository.save(component);
//            logger.info(component.toString());
        }

        return "redirect:/system?id=" + id;
    }

}
