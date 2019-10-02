/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Jhon Baron
 */
@Entity
@Table(name = "contact")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Contact.findAll", query = "SELECT c FROM Contact c")
    , @NamedQuery(name = "Contact.findByIdcontact", query = "SELECT c FROM Contact c WHERE c.idcontact = :idcontact")
    , @NamedQuery(name = "Contact.findByUsername", query = "SELECT c FROM Contact c WHERE c.username = :username")
    , @NamedQuery(name = "Contact.findByPhoneNumber", query = "SELECT c FROM Contact c WHERE c.phoneNumber = :phoneNumber")
    , @NamedQuery(name = "Contact.findByIduser", query = "SELECT c FROM Contact c WHERE c.iduser = :iduser")})
public class Contact implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idcontact")
    private Integer idcontact;
    @Basic(optional = false)
    @Column(name = "username")
    private String username;
    @Basic(optional = false)
    @Column(name = "phoneNumber")
    private int phoneNumber;
    @Basic(optional = false)
    @Column(name = "iduser")
    private int iduser;

    public Contact() {
    }

    public Contact(Integer idcontact) {
        this.idcontact = idcontact;
    }

    public Contact(Integer idcontact, String username, int phoneNumber, int iduser) {
        this.idcontact = idcontact;
        this.username = username;
        this.phoneNumber = phoneNumber;
        this.iduser = iduser;
    }

    public Integer getIdcontact() {
        return idcontact;
    }

    public void setIdcontact(Integer idcontact) {
        this.idcontact = idcontact;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getIduser() {
        return iduser;
    }

    public void setIduser(int iduser) {
        this.iduser = iduser;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcontact != null ? idcontact.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Contact)) {
            return false;
        }
        Contact other = (Contact) object;
        if ((this.idcontact == null && other.idcontact != null) || (this.idcontact != null && !this.idcontact.equals(other.idcontact))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.app.model.Contact[ idcontact=" + idcontact + " ]";
    }
    
}
