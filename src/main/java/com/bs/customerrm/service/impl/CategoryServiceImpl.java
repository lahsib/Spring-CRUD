/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bs.customerrm.service.impl;

import com.bs.customerrm.dao.CategoryDAO;
import com.bs.customerrm.entity.Category;
import com.bs.customerrm.service.CategoryService;
import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Bishal
 */

@Service(value = "CategoryService")
public class CategoryServiceImpl implements CategoryService{
    @Autowired
    private CategoryDAO categoryDAO;
    @Override
    public void insert(Category c) throws SQLException {
        categoryDAO.insert(c);
    }

    @Override
    public void update(Category c) throws SQLException {
        categoryDAO.update(c);
    }

    @Override
    public void delete(int catId) throws SQLException {
         categoryDAO.delete(catId);
    }

    @Override
    public List<Category> getAll() throws SQLException {
        return categoryDAO.getAll();
    }

    @Override
    public Category getById(int catId) throws SQLException {
        return categoryDAO.getById(catId);
    }
    
}
