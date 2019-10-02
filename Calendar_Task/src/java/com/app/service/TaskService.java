/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.service;

import com.app.dao.ImplDao;
import com.app.implDao.ITask;
import com.app.model.Task;
import java.io.Serializable;

/**
 *
 * @author Jhon Baron
 */
public class TaskService extends ImplDao<Task, Integer> implements ITask, Serializable{
    
}
