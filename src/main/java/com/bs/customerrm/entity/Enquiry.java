/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bs.customerrm.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Bishal
 */
@Entity
@Table(name = "tbl_enquiry", catalog = "crm", schema = "")
@NamedQueries({
    @NamedQuery(name = "Enquiry.findAll", query = "SELECT e FROM Enquiry e"),
    @NamedQuery(name = "Enquiry.findById", query = "SELECT e FROM Enquiry e WHERE e.id = :id"),
    @NamedQuery(name = "Enquiry.findByName", query = "SELECT e FROM Enquiry e WHERE e.name = :name"),
    @NamedQuery(name = "Enquiry.findByEmail", query = "SELECT e FROM Enquiry e WHERE e.email = :email"),
    @NamedQuery(name = "Enquiry.findByCategory", query = "SELECT e FROM Enquiry e WHERE e.category = :category"),
    @NamedQuery(name = "Enquiry.findByDate", query = "SELECT e FROM Enquiry e WHERE e.date = :date"),
    @NamedQuery(name = "Enquiry.findByReply", query = "SELECT e FROM Enquiry e WHERE e.reply = :reply")})
public class Enquiry implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)    
    private Integer id;    
    @Size(min = 1, max = 100)
    private String name;    
    @Size(min = 1, max = 65535)
    private String message;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(min = 1, max = 100)
    private String email;    
    @Size(min = 1, max = 100)
    private String category;    
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;    
    private short reply;

    public Enquiry() {
    }

    public Enquiry(Integer id) {
        this.id = id;
    }

    public Enquiry(Integer id, String name, String message, String email, String category, Date date, short reply) {
        this.id = id;
        this.name = name;
        this.message = message;
        this.email = email;
        this.category = category;
        this.date = date;
        this.reply = reply;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public short getReply() {
        return reply;
    }

    public void setReply(short reply) {
        this.reply = reply;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Enquiry)) {
            return false;
        }
        Enquiry other = (Enquiry) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.bs.customerrm.entity.Enquiry[ id=" + id + " ]";
    }
    
}
