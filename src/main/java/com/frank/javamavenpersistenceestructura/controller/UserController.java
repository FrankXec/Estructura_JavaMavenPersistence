package com.frank.javamavenpersistenceestructura.controller;

import com.frank.javamavenpersistenceestructura.dao.UserDAO;
import com.frank.javamavenpersistenceestructura.dto.UserDTO;
import java.util.List;

public class UserController {
    private UserDAO dao;
    
    public UserController(){
        dao = new UserDAO();
    }
    
    public List<UserDTO> getAll(){
        return dao.getAll();
    }
    
    public UserDTO getOneById(String id){
        return dao.getOneById(id);
    }
    
    public boolean create(UserDTO entity){
        return dao.create(entity);
    }
    
    public boolean update(UserDTO entity){
        return dao.update(entity);
    }
    
    public boolean delete(String id){
        return dao.delete(id);
    }
}
