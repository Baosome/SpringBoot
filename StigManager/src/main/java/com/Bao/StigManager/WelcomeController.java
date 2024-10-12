package com.Bao.StigManager;

import java.time.LocalDate;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.BindingResult;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.Bao.StigManager.Repositories.SystemRepository;
import com.Bao.StigManager.System.SystemEntity;

import jakarta.validation.Valid;

@Controller
@SessionAttributes("name")
public class WelcomeController {

    private final SystemRepository systemRepository;

    Logger logger = LoggerFactory.getLogger(WelcomeController.class);

    public WelcomeController(SystemRepository systemRepository) {
        this.systemRepository = systemRepository;
    }

    @RequestMapping(value="/", method = RequestMethod.GET)
    public String Welcome(ModelMap modelMap){
        modelMap.put("name", getUsername());

        // Grab repository and display it to system list in welcome page
        List<SystemEntity> systems = systemRepository.findByUsername(getUsername());
        modelMap.addAttribute("systems", systems);

        return "WelcomePage";
    }

    private String getUsername() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        return authentication.getName();
    }

    @RequestMapping(value = "add-system", method = RequestMethod.GET)
    private String newSystemGet(ModelMap modelMap) {
        
        SystemEntity newSystemEntity = new SystemEntity(0, getUsername(), "", null);

        modelMap.addAttribute("system", newSystemEntity);
        return "NewSystemPage";
    }

    @RequestMapping(value = "add-system", method = RequestMethod.POST)
    private String newSystemPost(ModelMap modelMap, @Valid SystemEntity systemEntity, BindingResult result) {

        if (result.hasErrors()) return "/";
        systemEntity.setUsername(getUsername());
        systemRepository.save(systemEntity);
        logger.info(systemEntity.toString());
        return "redirect:/";
    }

}
