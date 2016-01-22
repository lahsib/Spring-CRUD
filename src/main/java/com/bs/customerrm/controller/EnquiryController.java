/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bs.customerrm.controller;

import com.bs.customerrm.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Bishal
 */
@Controller
@RequestMapping(value = "/admin/enquiry")
public class EnquiryController {
    @Autowired
    private CategoryService categoryService;
    public @ResponseBody String index(){
        return "<h1>Enquiry Page</h1>";
    }
}
