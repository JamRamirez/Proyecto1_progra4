/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import Database.Database;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import logic.Grupo;

/**
 *
 * @author jamca
 */
public class DaoGrupo {
    
    
//    public Grupo create(Grupo cl) throws SQLException,Exception{
//        String sqlcommand = "insert into grupos (num_grupo,id_curso,id_prof,dias,horario)"
//                + "values(?,?,?,?,?)";
//        PreparedStatement stm = Database.instance().prepareStatement(sqlcommand);
//        
//        stm.setString(1,cl.getCedula());
//        stm.setString(2,cl.getNombre());
//        stm.setString(3,cl.getContrasenna());
//        stm.setString(4,cl.getTelefono());
//        stm.setString(5,cl.getCorreo());
//        stm.setInt(6,cl.getRol());
//        stm.setString(7,cl.getEspecialidad());
//        
//        System.out.println(stm);
//        int count = Database.instance().executeUpdate(stm);
//        if (count == 0) {
//            throw  new Exception("Grupo Existente");
//        }
//        return cl;
//    }
//    
//    public Usuario read(String id) throws Exception{
//        
//        String sqlcommand = "select * from grupos where id = ?";
//        System.out.println("Ingresando a la DB");
//        PreparedStatement stm = Database.instance().prepareStatement(sqlcommand);
//        System.out.print("Buscando Grupo en DB");
//        stm.setString(1, id);
//        ResultSet rs =  Database.instance().executeQuery(stm); 
//        if (rs.next()) {
//            System.out.println("Grupo encontrado base de datos");
//            
//            return from(rs);
//        }
//        else{
//            System.out.println("Database: Grupo no existe");
//            throw new Exception ("Grupo no Existe");
//        }
//        
//    }
//    
//    public Usuario from (ResultSet rs){
//        try{
//            Usuario r = new Usuario();
//            r.setCedula(rs.getString("id"));
//            r.setNombre(rs.getString("nombre"));
//            
//            r.setContrasenna(rs.getString("contrasenna"));
//            r.setTelefono(rs.getString("telefono"));
//            r.setCorreo(rs.getString("email"));
//            r.setRol(rs.getInt("rol"));
//            r.setEspecialidad(rs.getString("expecialidad"));
//            System.out.println("Usuario Creado");
//            return r;
//        } catch (SQLException ex){
//            System.out.println("Error creando Usuario");
//            return null;
//        }
//                
//    }
    
}
