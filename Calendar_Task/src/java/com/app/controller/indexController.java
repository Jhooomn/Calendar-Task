/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.controller;

import com.app.model.Contact;
import com.app.model.User;
import com.app.service.ContactService;
import com.app.service.UserService;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Jhon Baron
 */
@ManagedBean
@SessionScoped
public class indexController implements Serializable{

    /**
     * Creates a new instance of indexController
     */
    User user = new User();
    UserService service = new UserService();

    public indexController() {
    }

    public String addUser() {
        System.out.println("adduser");
        if ((user.getUsername().length() != 0) && (user.getPassword().length() != 0) && (user.getPhoneNumber() > 0)) {
            System.out.println("entra");
            service.crear(user);
            return "home.xhtml?faces-redirect=true";
        }
        return "";
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public UserService getService() {
        return service;
    }

    public void setService(UserService service) {
        this.service = service;
    }

}
