package com.Bao.StigManager.System;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.Bao.StigManager.Repositories.SystemRepository;

@Controller
@SessionAttributes("name")
public class SystemController {
    private SystemRepository repository;

    public SystemController(SystemRepository repository) {
        this.repository = repository;
    }

    
}
