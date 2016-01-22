/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bs.customerrm.dao.impl;

import com.bs.customerrm.dao.CategoryDAO;
import com.bs.customerrm.entity.Category;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Bishal
 */
@Repository
public class CategoryDAOImpl implements CategoryDAO{
    @Autowired
    private SessionFactory sessionFactory;
    private Session session;
    
    
    @Override
    public void insert(Category c) throws SQLException {
        session= sessionFactory.getCurrentSession();
        Transaction trans=session.beginTransaction();
         session.saveOrUpdate(c);
        trans.commit();
               
    }

    @Override
    public void update(Category c) throws SQLException {
        session= sessionFactory.getCurrentSession();
        Transaction trans=session.beginTransaction();
        session.saveOrUpdate(c);
        trans.commit();
    }

    @Override
    public void delete(int catId) throws SQLException {
        session= sessionFactory.getCurrentSession();
        Transaction trans=session.beginTransaction();
        session.delete(getById(catId));
        trans.commit();
    }

    @Override
    public List<Category> getAll() throws SQLException {
       session=sessionFactory.openSession();
       List<Category> categoryList=session.createQuery("SELECT c from Category c").list();
       return categoryList;
    }

    @Override
    public Category getById(int catId) throws SQLException {
        session=sessionFactory.openSession();
        Category category =(Category)session.get(Category.class, catId);
        return category;
    }

    
}
