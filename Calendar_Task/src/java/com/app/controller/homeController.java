/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.controller;

import com.app.model.User;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Jhon Baron
 */
@ManagedBean
@RequestScoped
public class homeController implements Serializable {

    /**
     * Creates a new instance of homeController
     */
    @ManagedProperty(value = "#{indexController}")
    private indexController login;

    private User user = new User();

    public homeController() {
    }

    public indexController getLogin() {
        return login;
    }

    public void setLogin(indexController login) {
        this.login = login;
    }

    public User getUser() {
        return login.getUser();
    }

    public void setUser(User user) {
        this.user = user;
    }

}
