package com.frank.javamavenpersistenceestructura;

import com.frank.javamavenpersistenceestructura.controller.*;
import com.frank.javamavenpersistenceestructura.dto.*;
import java.util.List;

public class JavaMavenPersistenceEstructura {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        //controller
        UserController controller = new UserController();
        boolean exito;
        //save
        /*UserDTO entity = new UserDTO();
        entity.setName("FRANCISCO");
        entity.setLastName("XEC");
        entity.setNickName("frankxec");
        entity.setEmail("francisco@gmail.com");
        entity.setPassword("admin123");

        exito = controller.create(entity);
        if(exito){
            System.out.println("Guardado con exito!");
        }else{
            System.out.println("Error al guardar");
        }*/
        //getOne
        /*var searchEntity = controller.getOneById("1");
        if(searchEntity != null){
            System.out.println("Encontrado: "+searchEntity.toString());
        }else{
            System.out.println("No se encontro el dato");
        }
        //listAll
        List<UserDTO> searchEntitys= controller.getAll();
        if(searchEntitys != null){
            for(UserDTO item: searchEntitys){
                System.out.println(item.toString());
            }
        }else{
            System.out.println("No se encontraron datos");
        }*/
        //update
        /*var userUpdate = controller.getOneById("1");
        userUpdate.setPassword("admin123admin");
        userUpdate.setEmail("frankxec64@outlook.com");
        exito = controller.update(userUpdate);
        if(exito){
            System.out.println("Editado con Exito!!");
        }else{
            System.out.println("Error al editar");
        }*/
        //delete
        /*exito = controller.delete("1");
        if(exito){
            System.out.println("Eliminado con Exito!!");
        }else{
            System.out.println("Error al eliminar");
        }*/
    }
}
