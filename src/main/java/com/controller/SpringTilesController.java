/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Alexey
 */
@Controller
public class SpringTilesController {
        
    @RequestMapping(value="/index")
    public String index() {
        return "index";
    }
    
    @RequestMapping(value="/viewPeson")
    public ModelAndView viewPersons(Model model) {                 
        return new ModelAndView("personList");
    }
    
    /*@RequestMapping(value="/test")
    public ModelAndView viewTest(Model model) {                 
        return new ModelAndView("test");
    }
    */
    
    @RequestMapping(value="/test")
    public String viewTest (HttpServletRequest request,Model model){
        System.out.println("getAuthType(): "+request.getAuthType());
        System.out.println(SecurityContextHolder.getContext().getAuthentication().getPrincipal());
        return "test";
    }
}
