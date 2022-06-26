package com.frank.javamavenpersistenceestructura.dao;

import com.frank.javamavenpersistenceestructura.config.PersistenceConnection;
import com.frank.javamavenpersistenceestructura.dto.UserDTO;
import com.frank.javamavenpersistenceestructura.interfaces.ICRUD;
import java.util.List;
import jakarta.persistence.*;

//Query query = session.createQuery("") //crear query
//entitys = (cast) query.uniqueResult(); // Query query = session.createQuery("from UserDTO WHERE id = 1", UserDTO.class);
//Object[] object = (Object[]) query.uniqueResult(); // Query query = session.createQuery("select nickName, email, password from UserDTO", UserDTO.class);
//SQLQuery slqQuery = session.createSQLQuery("") //sql normal
//sqlQuery.addEntity(Entity.class)
//transform if not need all columns
//sqlQuery.setResultTransformer(Criteria.Alias_to_entity_map)
//List entity = query.list();
//in for -> Map map = (Map)item; -> use map;
public class UserDAO implements ICRUD<UserDTO>{
    private UserDTO entity = null;
    private EntityManager manager = null;
    private boolean status = false;
    private List<UserDTO> entitys = null;

    @Override
    public List<UserDTO> getAll() {
        try{
            manager = PersistenceConnection.getManager();
            manager.getTransaction().begin();
            Query query = manager.createQuery("from UserDTO", UserDTO.class);
            entitys = query.getResultList();
            manager.getTransaction().commit();
        }catch(Exception ex){
            System.out.println("Error.GetAll.User: "+ex);
        }finally{
            manager.close();
        }
        return entitys;
    }

    @Override
    public UserDTO getOneById(String id) {
        try{
            manager = PersistenceConnection.getManager();
            entity = manager.find(UserDTO.class, Long.parseLong(id));
        }catch(Exception ex){
            System.out.println("Error.GetOneById.User: "+ex);
        }finally{
            manager.close();
        }
        return entity;
    }

    @Override
    public boolean create(UserDTO entity) {
        try{
            manager = PersistenceConnection.getManager();
            manager.getTransaction().begin();
            manager.persist(entity);
            //session.detach(object); -> no deja  modificar despues de la insercion
            manager.getTransaction().commit();
            status = true;
        }catch(Exception ex){
            System.out.println("Error.Create.User: "+ex);
        }finally{
            manager.close();
        }
        return status;
    }

    @Override
    public boolean update(UserDTO entity) {
        try{
            manager = PersistenceConnection.getManager();
            manager.getTransaction().begin();
            manager.merge(entity);
            //session.detach(object); -> no deja  modificar despues de la insercion
            manager.getTransaction().commit();
            status = true;
        }catch(Exception ex){
            System.out.println("Error.Update.User: "+ex);
        }finally{
            manager.close();
        }
        return status;
    }

    @Override
    public boolean delete(String id) {
        try{
            manager = PersistenceConnection.getManager();
            manager.getTransaction().begin();
            UserDTO user = manager.find(UserDTO.class, Long.parseLong(id));
            manager.remove(user);
            //session.detach(object); -> no deja  modificar despues de la insercion
            manager.getTransaction().commit();
            status = true;
        }catch(Exception ex){
            System.out.println("Error.Delete.User: "+ex);
        }finally{
            manager.close();
        }
        return status;
    }
}
