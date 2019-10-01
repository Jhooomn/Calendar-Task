/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.service;

import com.app.dao.ImplDao;
import com.app.implDao.IContact;
import com.app.model.Contact;
import java.io.Serializable;

/**
 *
 * @author Jhon Baron
 */
public class ContactService extends ImplDao<Contact, Integer> implements IContact, Serializable {
    
}
