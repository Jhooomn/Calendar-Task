/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Jhon Baron
 */
@Entity
@Table(name = "task")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Task.findAll", query = "SELECT t FROM Task t")
    , @NamedQuery(name = "Task.findByIdtask", query = "SELECT t FROM Task t WHERE t.idtask = :idtask")
    , @NamedQuery(name = "Task.findByTitle", query = "SELECT t FROM Task t WHERE t.title = :title")
    , @NamedQuery(name = "Task.findByDayFrom", query = "SELECT t FROM Task t WHERE t.dayFrom = :dayFrom")
    , @NamedQuery(name = "Task.findByDayTo", query = "SELECT t FROM Task t WHERE t.dayTo = :dayTo")
    , @NamedQuery(name = "Task.findByIduser", query = "SELECT t FROM Task t WHERE t.iduser = :iduser")})
public class Task implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idtask")
    private Integer idtask;
    @Basic(optional = false)
    @Column(name = "title")
    private String title;
    @Basic(optional = false)
    @Column(name = "dayFrom")
    @Temporal(TemporalType.DATE)
    private Date dayFrom;
    @Basic(optional = false)
    @Column(name = "dayTo")
    @Temporal(TemporalType.DATE)
    private Date dayTo;
    @Basic(optional = false)
    @Column(name = "iduser")
    private int iduser;

    public Task() {
    }

    public Task(Integer idtask) {
        this.idtask = idtask;
    }

    public Task(Integer idtask, String title, Date dayFrom, Date dayTo, int iduser) {
        this.idtask = idtask;
        this.title = title;
        this.dayFrom = dayFrom;
        this.dayTo = dayTo;
        this.iduser = iduser;
    }

    public Integer getIdtask() {
        return idtask;
    }

    public void setIdtask(Integer idtask) {
        this.idtask = idtask;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getDayFrom() {
        return dayFrom;
    }

    public void setDayFrom(Date dayFrom) {
        this.dayFrom = dayFrom;
    }

    public Date getDayTo() {
        return dayTo;
    }

    public void setDayTo(Date dayTo) {
        this.dayTo = dayTo;
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
        hash += (idtask != null ? idtask.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Task)) {
            return false;
        }
        Task other = (Task) object;
        if ((this.idtask == null && other.idtask != null) || (this.idtask != null && !this.idtask.equals(other.idtask))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.app.model.Task[ idtask=" + idtask + " ]";
    }
    
}
