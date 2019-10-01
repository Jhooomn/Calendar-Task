/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Jhon Baron
 */
@Embeddable
public class ContactPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "idcontact")
    private int idcontact;
    @Basic(optional = false)
    @Column(name = "user_iduser")
    private int userIduser;

    public ContactPK() {
    }

    public ContactPK(int idcontact, int userIduser) {
        this.idcontact = idcontact;
        this.userIduser = userIduser;
    }

    public int getIdcontact() {
        return idcontact;
    }

    public void setIdcontact(int idcontact) {
        this.idcontact = idcontact;
    }

    public int getUserIduser() {
        return userIduser;
    }

    public void setUserIduser(int userIduser) {
        this.userIduser = userIduser;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idcontact;
        hash += (int) userIduser;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ContactPK)) {
            return false;
        }
        ContactPK other = (ContactPK) object;
        if (this.idcontact != other.idcontact) {
            return false;
        }
        if (this.userIduser != other.userIduser) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.app.model.ContactPK[ idcontact=" + idcontact + ", userIduser=" + userIduser + " ]";
    }
    
}
