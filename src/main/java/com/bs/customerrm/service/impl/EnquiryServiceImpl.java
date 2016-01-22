/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bs.customerrm.service.impl;

import com.bs.customerrm.dao.EnquiryDAO;
import com.bs.customerrm.entity.Enquiry;
import com.bs.customerrm.service.EnquiryService;
import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Bishal
 */
@Service(value = "EnquiryService")
public class EnquiryServiceImpl implements EnquiryService {
    @Autowired
    EnquiryDAO enquiryDAO;
    @Override
    public void insert(Enquiry e) throws SQLException {
        enquiryDAO.insert(e);
    }

    @Override
    public void update(Enquiry e) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(int id) throws SQLException {
        enquiryDAO.delete(id);
    }

    @Override
    public List<Enquiry> getAll() throws SQLException {
        return enquiryDAO.getAll();
    }

    @Override
    public Enquiry getById(int id) throws SQLException {
        return enquiryDAO.getById(id);
    }
    
}
