package com.frank.javamavenpersistenceestructura.controller;

import com.frank.javamavenpersistenceestructura.dao.ProductDAO;
import com.frank.javamavenpersistenceestructura.dto.ProductDTO;
import java.util.List;

public class ProductController {
    private ProductDAO dao;
    
    public ProductController(){
        dao = new ProductDAO();
    }
    
    public List<ProductDTO> getAll(){
        return dao.getAll();
    }
    
    public ProductDTO getOneById(String id){
        return dao.getOneById(id);
    }
    
    public boolean create(ProductDTO entity){
        return dao.create(entity);
    }
    
    public boolean update(ProductDTO entity){
        return dao.update(entity);
    }
    
    public boolean delete(String id){
        return dao.delete(id);
    }
}
