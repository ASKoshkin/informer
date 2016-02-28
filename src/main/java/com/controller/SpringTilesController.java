/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

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
        
        System.out.println("Enter index!!!!!!!!!!!!!!!!!!!!");
        
        return "index";
    }
    
    @RequestMapping(value="/viewPeson")
    public ModelAndView viewPersons(Model model) {        
         System.out.println("Enter viewPeson!!!!!!!!!!!!!!!!!!!!");
        return new ModelAndView("personList");
    }
}
