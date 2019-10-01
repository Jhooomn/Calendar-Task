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
public class TaskPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "idtask")
    private int idtask;
    @Basic(optional = false)
    @Column(name = "user_iduser")
    private int userIduser;

    public TaskPK() {
    }

    public TaskPK(int idtask, int userIduser) {
        this.idtask = idtask;
        this.userIduser = userIduser;
    }

    public int getIdtask() {
        return idtask;
    }

    public void setIdtask(int idtask) {
        this.idtask = idtask;
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
        hash += (int) idtask;
        hash += (int) userIduser;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TaskPK)) {
            return false;
        }
        TaskPK other = (TaskPK) object;
        if (this.idtask != other.idtask) {
            return false;
        }
        if (this.userIduser != other.userIduser) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.app.model.TaskPK[ idtask=" + idtask + ", userIduser=" + userIduser + " ]";
    }
    
}
