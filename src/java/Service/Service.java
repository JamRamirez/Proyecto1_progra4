/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Database.*;
import java.util.List;
import logic.*;


/**
 *
 * @author pgat3000
 */
public class Service {
    private DaoUsuarios usuarioDao;
    private DaoCursos cursosdao;

    
    private static Service theInstance;
    
    public static Service singleton(){
        if(theInstance==null){
            theInstance = new Service();
        }
        return theInstance;
    }
    
    public Service(){
        usuarioDao = new DaoUsuarios();
        cursosdao= new DaoCursos();
    }
    //Jalar lista de curso de la base de datos 
    public List<Curso> lista_cursos() throws Exception{
      return null;
    }
    
    //devuelve cursos con descuento
  
    
    
//crear nuevo matricula
       
//crear nuevp grupo
    
//crear nuevo curso
     public Curso crear_curso(Curso u){
         Curso result = null;
         try{
            result=cursosdao.create(u);
            System.out.println(u.getCedula());
              return result;
         }
         catch(Exception e){
           return null ;//usuario ya existe 
         }
   
    }
     
     
    //crear usario nuevo en la base de datos
    public Usuario crear_usuario(Usuario u){
         Usuario result = null;
         try{
            result=usuarioDao.create(u);
            System.out.println(u.getCedula());
              return result;
         }
         catch(Exception e){
           return null ;//usuario ya existe 
         }
   
    }
    public Usuario login(Usuario u) throws Exception{
        Usuario result = null;
        
        result = usuarioDao.read(u.getCedula());
        System.out.println("Service tiene la culpa");
        if(result == null)
            throw new Exception("Usuario no encontrado");
               System.out.println("Contrassena de base de datos: "+result.getContrasenna());
        System.out.println("Contrassena de usuario: "+u.getContrasenna());
            if((result.getContrasenna()).equals(u.getContrasenna())){
               System.out.println("Correcto");  
            }
        if(!(result.getContrasenna()).equals(u.getContrasenna())){
            throw new Exception("Usuario con mala contrasenna");
        }
        
        return result;
    }
    
    //falta solo de implementar en service, ya exise el metodo en dao respectivo
    //FALTA leer grupos por curso
    //FALTA LEER profesor por grupo
    //FALTAleer grupos por profe
    //FALTAgrupos por estudiante(historial)
    //FALTAEstudiantes por grupo
}
