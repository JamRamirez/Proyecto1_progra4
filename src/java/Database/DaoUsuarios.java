package Database;

import Database.Database;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import logic.Usuario;

/**
 *
 * @author jamca
 */
public class DaoUsuarios {
    
    public Usuario create(Usuario cl) throws SQLException,Exception{
        String sqlcommand = "insert into Usuarios (id,nombre,contrasenna,telefono,email,rol,especialidad)"
                + "values(?,?,?,?,?,?,?)";
        PreparedStatement stm = Database.instance().prepareStatement(sqlcommand);
        
        stm.setString(1,cl.getCedula());
        stm.setString(2,cl.getNombre());
        stm.setString(3,cl.getContrasenna());
        stm.setString(4,cl.getTelefono());
        stm.setString(5,cl.getCorreo());
        stm.setInt(6,cl.getRol());
        stm.setString(7,cl.getEspecialidad());
        
        System.out.println(stm);
        int count = Database.instance().executeUpdate(stm);
        if (count == 0) {
            throw  new Exception("Usuario Existente");
        }
        return cl;
    }
    
    public Usuario read(String id) throws Exception{
        System.out.println("READ USUARIOS----- 1");
        String sqlcommand = "select * from usuarios where id = ?";
        System.out.println("Ingresando a la DB");
        PreparedStatement stm = Database.instance().prepareStatement(sqlcommand);
        System.out.print("Buscando Usuario en DB*********************");
        stm.setString(1, id);
        System.out.println(id+"--------------------------");
        ResultSet rs =  Database.instance().executeQuery(stm); 
        if (rs.next()) {
            System.out.println("Usuario encontrado base de datos");
            
            return from(rs);
        }
        else{
            System.out.println("Database: Usuario no existe");
            throw new Exception ("Usuario no Existe");
        }
        
    }
    
    public Usuario from (ResultSet rs){
        try{
            Usuario r = new Usuario();
            r.setCedula(rs.getString("id"));
            r.setNombre(rs.getString("nombre"));
            
            r.setContrasenna(rs.getString("contrasenna"));
            r.setTelefono(rs.getString("telefono"));
            r.setCorreo(rs.getString("email"));
            r.setRol(rs.getInt("rol"));
            r.setEspecialidad(rs.getString("especialidad"));
            System.out.println("Usuario Creado");
            return r;
        } catch (SQLException ex){
            System.out.println("Error creando Usuario");
            return null;
        }
                
    }
    
    
}
