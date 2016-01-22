/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bs.customerrm.controller;

import com.bs.customerrm.entity.Category;
import com.bs.customerrm.service.CategoryService;
import java.sql.SQLException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Bishal
 */
@Controller
@RequestMapping(value = "/admin/category")
public class CategoryContoller {
    @Autowired
    private CategoryService categoryService;
    
    @RequestMapping(method = RequestMethod.GET)
    public String index(ModelMap map) throws SQLException{
        map.addAttribute("category", categoryService.getAll());
        return "/admin/category/index";
    }
    @RequestMapping(value="/add",method = RequestMethod.GET)
    public ModelAndView add() throws SQLException{
        ModelAndView mv=new ModelAndView("admin/category/add");
        mv.addObject("Category",new Category());
        return mv;
    } 
    @RequestMapping(value="/edit/{catId}",method = RequestMethod.GET)
    public ModelAndView edit(@PathVariable("catId")int catId) throws SQLException{
        ModelAndView mv=new ModelAndView("admin/category/edit");
        mv.addObject("Category",categoryService.getById(catId));
        return mv;        
    }  
        
    @RequestMapping(value="/save",method = RequestMethod.POST)
    public  String save(@ModelAttribute("Category") Category c){
            
        try{                
            if(c.getCatId()==0){
                categoryService.insert(c);
            }else{
                categoryService.update(c);
            }                             
            }catch(SQLException se){

            }

             return "redirect:/admin/category";
        }    
    @RequestMapping(value="/delete/{catId}",method = RequestMethod.GET)
    public String delete(@PathVariable("catId")int catId) throws SQLException{
       categoryService.delete(catId);
       return "redirect:/admin/category";
    }    
}
