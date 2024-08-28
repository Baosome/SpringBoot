package com.Bao.StigManager.STIG;

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

    private SystemRepository systemRepository;

    public StigController(SystemRepository systemRepository) {
        this.systemRepository = systemRepository;
    }

    @RequestMapping(value = "system", method=RequestMethod.GET)
    public String showUpdateTodoPage(@RequestParam int id, ModelMap model) {
        model.put("eMassID", id);
        return "SystemPage";
    }

}
