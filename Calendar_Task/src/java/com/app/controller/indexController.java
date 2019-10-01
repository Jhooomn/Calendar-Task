/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.controller;

import com.app.model.Contact;
import com.app.model.User;
import com.app.service.UserService;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Jhon Baron
 */
@ManagedBean
@SessionScoped
public class indexController {

    /**
     * Creates a new instance of indexController
     */
    User user = new User();
    UserService service = new UserService();
    User user_in = new User();
    Contact contact = new Contact();
    public indexController() {
    }

    public void addUser() {
        System.out.println("adduser");
        if ((user.getUsername().length() != 0) && (user.getPassword().length() != 0) && (user.getPhoneNumber() > 0)) {
            System.out.println("entra");
            service.crear(user);
            user_in = user;
            user = new User();
        }
    }

    public void addContact() {
        if ((contact.getUsername().length() != 0) && (contact.getPhoneNumber() > 0)) {
            System.out.println("contact added");
            user.getContactList().add(contact);
            contact = new Contact();
        }
    }

    public User getUser_in() {
        return user_in;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }
    
    

    public void setUser_in(User user_in) {
        this.user_in = user_in;
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
