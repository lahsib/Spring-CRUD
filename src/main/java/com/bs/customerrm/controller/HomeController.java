/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bs.customerrm.controller;

import java.sql.SQLException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Bishal
 */
@Controller
@RequestMapping("/")
public class HomeController {
     @RequestMapping(method = RequestMethod.GET)
    public String index() throws SQLException{
        
        return "index";
    }
}
