package logic;

import java.util.Objects;


public class Usuario {
    
    private String cedula;
    private String nombre;
    private String contrasenna;
    private String telefono;
    private int rol;
    private String correo;
    private String especialidad;
    
    
    
    public Usuario(){
    }
    
    public Usuario(String cedula, String nombre, String contrasenna, String telefono, String correo, int rol, String especialidad) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.contrasenna = contrasenna;
        this.telefono = telefono;
        this.correo = correo;
        this.rol = rol;
        this.especialidad = especialidad;
    }
    
    public Usuario(String cedula){
        this.cedula = cedula;
    }
    
    public String getCedula(){
    return this.cedula;
    }
    
    public void setCedula(String cedula){
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getContrasenna() {
        return contrasenna;
    }

    public String getTelefono() {
        return telefono;
    }

    public int getRol() {
        return rol;
    }

    public String getCorreo() {
        return correo;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setContrasenna(String contrasenna) {
        this.contrasenna = contrasenna;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setRol(int rol) {
        this.rol = rol;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Usuario other = (Usuario) obj;
        if (!Objects.equals(this.cedula, other.cedula)) {
            return false;
        }
        return true;
    }
            
          
    
    
    
}
