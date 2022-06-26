package com.frank.javamavenpersistenceestructura.controller;

import com.frank.javamavenpersistenceestructura.dao.ProductTypeDAO;
import com.frank.javamavenpersistenceestructura.dto.ProductTypeDTO;
import java.util.List;


public class ProductTypeController {
    private ProductTypeDAO dao;
    
    public ProductTypeController(){
        dao = new ProductTypeDAO();
    }
    
    public List<ProductTypeDTO> getAll(){
        return dao.getAll();
    }
    
    public ProductTypeDTO getOneById(String id){
        return dao.getOneById(id);
    }
    
    public boolean create(ProductTypeDTO entity){
        return dao.create(entity);
    }
    
    public boolean update(ProductTypeDTO entity){
        return dao.update(entity);
    }
    
    public boolean delete(String id){
        return dao.delete(id);
    }
}
