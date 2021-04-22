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
import logic.Curso;

/**
 *
 * @author jamca
 */
public class DaoCursos {
    
     public Curso create(Curso cl) throws SQLException,Exception{
        String sqlcommand = "insert into cursos (id,tematica,descripcion,estado,precio)"
                + "values(?,?,?,?,?)";
        PreparedStatement stm = Database.instance().prepareStatement(sqlcommand);
        
        stm.setString(1,cl.getCedula());
        stm.setString(2,cl.getTematica());
        stm.setString(3,cl.getDescripcion());
        stm.setInt(4,cl.getEstado());
        stm.setDouble(5,cl.getCosto());
        
        System.out.println(stm);
        int count = Database.instance().executeUpdate(stm);
        if (count == 0) {
            throw  new Exception("Curso Existente");
        }
        return cl;
    }
    
    public Curso read(String id) throws Exception{
        
        String sqlcommand = "select * from cursos where id = ?";
        System.out.println("Ingresando a la DB");
        PreparedStatement stm = Database.instance().prepareStatement(sqlcommand);
        System.out.print("Buscando Curso en DB");
        stm.setString(1, id);
        ResultSet rs =  Database.instance().executeQuery(stm); 
        if (rs.next()) {
            System.out.println("Curso encontrado base de datos");
            
            return from(rs);
        }
        else{
            System.out.println("Database: Curso no existe");
            throw new Exception ("Curso no Existe");
        }
        
    }
    
    public Curso from (ResultSet rs){
        try{
            Curso r = new Curso();
            r.setCedula(rs.getString("id"));
            r.setTematica(rs.getString("tematica"));
            r.setDescripcion(rs.getString("descripcion"));
            r.setEstado(rs.getInt("estado"));
            r.setCosto(rs.getDouble("precio"));
            System.out.println("Usuario Creado");
            return r;
        } catch (SQLException ex){
            System.out.println("Error creando Usuario");
            return null;
        }
                
    }
    
    
}
