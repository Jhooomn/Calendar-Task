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
    List<User> users = new ArrayList<>();
    UserService service = new UserService();
    
    public loginController() {
    this.userOnList();
    }
    
    public void userOnList(){
        users = service.consultarTodo(User.class);
    }
    

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public UserService getService() {
        return service;
    }

    public void setService(UserService service) {
        this.service = service;
    }
    
    
    
}
