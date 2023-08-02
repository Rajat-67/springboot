package com.javabycode.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {
    @RequestMapping("/hello")
    public String hello(Model model, @RequestParam(value="name", required=false, defaultValue="World") String name) {
        
        String message="You just create Spring Boot Example successfully";
        model.addAttribute("name", name);
        model.addAttribute("message", message);
        
        return "hello";


    }
    
    @RequestMapping("/hello1")
    public String hello1(Model model, @RequestParam(value="name", required=false, defaultValue="Kumar") String name) {
        
        String message="You just Created your own api";
        model.addAttribute("name", name);
        model.addAttribute("message", message);
        
        return "hello";
    }

    @RequestMapping("/venkateshapi")
    public String getStart(Model model, @RequestParam(value="name", required=false, defaultValue="venky") String name) {

        String message="welcome to my Homepage";
        model.addAttribute("name", name);
        model.addAttribute("message", message);

        return "hello";
    }
    
    @RequestMapping("/newapi")
    public String getStart1(Model model, @RequestParam(value="name", required=false, defaultValue="NEW API") String name) {

        String message="welcome to my Homepage";
        model.addAttribute("name", name);
        model.addAttribute("message", message);

        return "hello";
        
    }
    @RequestMapping("/samyuktha")
    public String getStart3(Model model, @RequestParam(value="name", required=false, defaultValue="samyukthas") String name) {

        String message="welcome to my Homepage";
        model.addAttribute("name", name);
        model.addAttribute("message", message);

        return "hello";
        
    }
    @RequestMapping("/kshithija")
    public String getStart2(Model model, @RequestParam(value="name", required=false, defaultValue="Kshithija") String name) {

        String message="welcome to my Homepage";
        model.addAttribute("name", name);
        model.addAttribute("message", message);

        return "hello";
        
    }
}
