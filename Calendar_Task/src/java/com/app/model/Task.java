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
    , @NamedQuery(name = "Task.findByFrom", query = "SELECT t FROM Task t WHERE t.from = :from")
    , @NamedQuery(name = "Task.findByTo", query = "SELECT t FROM Task t WHERE t.to = :to")
    , @NamedQuery(name = "Task.findByAllDay", query = "SELECT t FROM Task t WHERE t.allDay = :allDay")
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
    @Column(name = "from")
    @Temporal(TemporalType.DATE)
    private Date from;
    @Basic(optional = false)
    @Column(name = "to")
    @Temporal(TemporalType.DATE)
    private Date to;
    @Basic(optional = false)
    @Column(name = "allDay")
    private short allDay;
    @Basic(optional = false)
    @Column(name = "iduser")
    private int iduser;

    public Task() {
    }

    public Task(Integer idtask) {
        this.idtask = idtask;
    }

    public Task(Integer idtask, String title, Date from, Date to, short allDay, int iduser) {
        this.idtask = idtask;
        this.title = title;
        this.from = from;
        this.to = to;
        this.allDay = allDay;
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

    public Date getFrom() {
        return from;
    }

    public void setFrom(Date from) {
        this.from = from;
    }

    public Date getTo() {
        return to;
    }

    public void setTo(Date to) {
        this.to = to;
    }

    public short getAllDay() {
        return allDay;
    }

    public void setAllDay(short allDay) {
        this.allDay = allDay;
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
