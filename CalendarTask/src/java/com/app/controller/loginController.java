/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.controller;

import com.app.model.User;
import com.app.service.UserService;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Jhon Baron
 */
@ManagedBean
@SessionScoped
public class loginController {

    /**
     * Creates a new instance of loginController
     */
    User user = new User();
    UserService service = new UserService();

    public loginController() {
    }

    public String LogIn() {
        List<User> users = new ArrayList<>();

        if (users.isEmpty()) {
            return "signup.xhtml?faces-redirect=true";
        } else {
            for (User u : users) {
                if ((u.getUsername().equalsIgnoreCase(user.getUsername())) && (u.getPassword().equalsIgnoreCase(user.getPassword()))) {
                    return "home.xhtml?faces-redirect=true";
                } else {
                    return "signup.xhtml?faces-redirect=true";
                }
            }
        }
        return "index.xhtml?faces-redirect=true";
    }
    
    public String SignUp(){
        return "signup.xhtml?faces-redirect=true";
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
