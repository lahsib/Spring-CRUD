/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bs.customerrm.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
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
@Table(name = "tbl_category", catalog = "crm", schema = "")
@NamedQueries({
    @NamedQuery(name = "Category.findAll", query = "SELECT c FROM Category c"),
    @NamedQuery(name = "Category.findByCatId", query = "SELECT c FROM Category c WHERE c.catId = :catId"),
    @NamedQuery(name = "Category.findByCatName", query = "SELECT c FROM Category c WHERE c.catName = :catName"),
    @NamedQuery(name = "Category.findByAddedDate", query = "SELECT c FROM Category c WHERE c.addedDate = :addedDate"),
    @NamedQuery(name = "Category.findByModifiedDate", query = "SELECT c FROM Category c WHERE c.modifiedDate = :modifiedDate"),
    @NamedQuery(name = "Category.findByStatus", query = "SELECT c FROM Category c WHERE c.status = :status")})
public class Category implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)    
    @Column(name = "cat_id", nullable = false)
    private Integer catId;   
    @Size(min = 1, max = 100)
    @Column(name = "cat_name", nullable = false, length = 100)
    private String catName;    
    @Size(min = 1, max = 65535)
    @Column(nullable = false, length = 65535)
    private String description;    
    @Column(name = "added_date",insertable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date addedDate;
    @Column(name = "modified_date",nullable = true)
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedDate;   
    @Column(nullable = true)
    private short status;

    public Category() {
    }

    public Category(Integer catId) {
        this.catId = catId;
    }

    public Category(Integer catId, String catName, String description, Date addedDate, short status) {
        this.catId = catId;
        this.catName = catName;
        this.description = description;
        this.addedDate = addedDate;
        this.status = status;
    }

    public Integer getCatId() {
        return catId;
    }

    public void setCatId(Integer catId) {
        this.catId = catId;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getAddedDate() {
        return addedDate;
    }

    public void setAddedDate(Date addedDate) {
        this.addedDate = addedDate;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public short getStatus() {
        return status;
    }

    public void setStatus(short status) {
        this.status = status;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (catId != null ? catId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Category)) {
            return false;
        }
        Category other = (Category) object;
        if ((this.catId == null && other.catId != null) || (this.catId != null && !this.catId.equals(other.catId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.bs.customerrm.entity.Category[ catId=" + catId + " ]";
    }
    
}
