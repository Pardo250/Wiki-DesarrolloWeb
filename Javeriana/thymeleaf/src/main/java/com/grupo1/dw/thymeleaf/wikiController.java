package com.grupo1.dw.thymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class wikiController {
    
    @GetMapping ("/wiki")
    public String wiki(){
        return "index";
    }
        
}
