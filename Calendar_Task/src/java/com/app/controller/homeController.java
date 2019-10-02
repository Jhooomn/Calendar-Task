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
import java.util.ArrayList;
import java.util.List;
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
    private Contact contact = new Contact();

    private ContactService contact_service = new ContactService();
    private UserService user_service = new UserService();
    List<Contact> contact_list = new ArrayList<>();

    public homeController() {
    }

    public void addContact() {
        Contact c = contact;
        for (User u : user_service.consultarTodo(User.class)) {
            if ((u.getUsername().equalsIgnoreCase(login.getUser().getUsername()))) {
                System.out.println("aqueeeeeeeee" + u.getIduser());
                c.setIduser(u.getIduser());
                contact_service.crear(c);
                contact = new Contact();
            }
        }
    }

//    public int myId(User u) {
//        for (User user1 : user_service.consultarTodo(User.class)) {
//            if ((user1.getUsername().equalsIgnoreCase(u.getUsername()))
//                    && (user1.getPhoneNumber() == u.getPhoneNumber())
//                    && (user1.getPassword().equalsIgnoreCase(u.getPassword()))) {
//                return user1.getIduser();
//            }
//        }
//        return 0;
//    }
    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public UserService getUser_service() {
        return user_service;
    }

    public void setUser_service(UserService user_service) {
        this.user_service = user_service;
    }

    public List<Contact> getContact_list() {
        return contact_list;
    }

    public void setContact_list(List<Contact> contact_list) {
        this.contact_list = contact_list;
    }

    public ContactService getContact_service() {
        return contact_service;
    }

    public void setContact_service(ContactService contact_service) {
        this.contact_service = contact_service;
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
