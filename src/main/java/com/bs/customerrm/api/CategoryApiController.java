/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bs.customerrm.api;

import com.bs.customerrm.entity.Category;
import com.bs.customerrm.service.CategoryService;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Bishal
 */
@RestController
@RequestMapping(value = "/api/category")
public class CategoryApiController {
    @Autowired
    private CategoryService categoryService;
    
    @RequestMapping(method = RequestMethod.GET,produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseStatus(HttpStatus.ACCEPTED)
    public List<Category> index() throws SQLException{
        
        return categoryService.getAll();
       
    }
    @RequestMapping(value="/{catId}",method = RequestMethod.GET,produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Category byId(@PathVariable("catId") int catId) throws SQLException
    {
        return categoryService.getById(catId);
    }
}
