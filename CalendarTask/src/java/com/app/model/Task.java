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
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
    , @NamedQuery(name = "Task.findByIdtask", query = "SELECT t FROM Task t WHERE t.taskPK.idtask = :idtask")
    , @NamedQuery(name = "Task.findByTitle", query = "SELECT t FROM Task t WHERE t.title = :title")
    , @NamedQuery(name = "Task.findByFrom", query = "SELECT t FROM Task t WHERE t.from = :from")
    , @NamedQuery(name = "Task.findByTo", query = "SELECT t FROM Task t WHERE t.to = :to")
    , @NamedQuery(name = "Task.findByAllDay", query = "SELECT t FROM Task t WHERE t.allDay = :allDay")
    , @NamedQuery(name = "Task.findByUserIduser", query = "SELECT t FROM Task t WHERE t.taskPK.userIduser = :userIduser")})
public class Task implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected TaskPK taskPK;
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
    @JoinColumn(name = "user_iduser", referencedColumnName = "iduser", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private User user;

    public Task() {
    }

    public Task(TaskPK taskPK) {
        this.taskPK = taskPK;
    }

    public Task(TaskPK taskPK, String title, Date from, Date to, short allDay) {
        this.taskPK = taskPK;
        this.title = title;
        this.from = from;
        this.to = to;
        this.allDay = allDay;
    }

    public Task(int idtask, int userIduser) {
        this.taskPK = new TaskPK(idtask, userIduser);
    }

    public TaskPK getTaskPK() {
        return taskPK;
    }

    public void setTaskPK(TaskPK taskPK) {
        this.taskPK = taskPK;
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (taskPK != null ? taskPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Task)) {
            return false;
        }
        Task other = (Task) object;
        if ((this.taskPK == null && other.taskPK != null) || (this.taskPK != null && !this.taskPK.equals(other.taskPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.app.model.Task[ taskPK=" + taskPK + " ]";
    }
    
}
