/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bs.customerrm.dao;

import com.bs.customerrm.entity.Enquiry;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Bishal
 */
public interface EnquiryDAO {
    public void insert(Enquiry e) throws SQLException;
    public void update(Enquiry e) throws SQLException;
    public void delete (int id) throws SQLException;
    public List<Enquiry>getAll() throws SQLException;
    public Enquiry getById(int id)throws SQLException;
}
