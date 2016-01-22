/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bs.customerrm.dao;

import com.bs.customerrm.entity.Category;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Bishal
 */
public interface CategoryDAO {
    public void insert(Category c) throws SQLException;
    public void update(Category c) throws SQLException;
    public void delete (int catId) throws SQLException;
    public List<Category>getAll() throws SQLException;
    public Category getById(int catId)throws SQLException;
}
