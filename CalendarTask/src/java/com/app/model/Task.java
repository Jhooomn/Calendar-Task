/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.model;

import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 *
 * @author Jhon Baron
 */
@Entity
@Table(name = "task")
public class Task implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "title")
    private String title;

    @Column(name = "from")
    private String from;

    @Column(name = "to")
    private String to;

    @Column(name = "allDay")
    private Boolean allDay;

    @JoinTable(name = "user_has_task", joinColumns = {
        @JoinColumn(name = "user_iduser", referencedColumnName = "id", nullable = false)}, inverseJoinColumns = {
        @JoinColumn(name = "task_idtask", referencedColumnName = "id", nullable = false)
    })
    @ManyToMany
    private User user;

    public Task() {
    }

    public Task(Integer id, String title, String from, String to, Boolean allDay, User user) {
        this.id = id;
        this.title = title;
        this.from = from;
        this.to = to;
        this.allDay = allDay;
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public Boolean getAllDay() {
        return allDay;
    }

    public void setAllDay(Boolean allDay) {
        this.allDay = allDay;
    }

}
