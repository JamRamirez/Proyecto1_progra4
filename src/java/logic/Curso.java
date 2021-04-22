package logic;

import java.util.Objects;

public class Curso {
    
    private String cedula;
    private String tematica;
    private String descripcion;
    private Double costo;
    private int estado;

    
    public Curso(){
    }
    
    public Curso(String cedula){
        this.cedula = cedula;
    }

    public String getCedula() {
        return cedula;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


    public String getTematica() {
        return tematica;
    }

    public Double getCosto() {
        return costo;
    }

    public int getEstado() {
        return estado;
    }


    public void setCedula(String cedula) {
        this.cedula = cedula;
    }


    public void setTematica(String tematica) {
        this.tematica = tematica;
    }

    public void setCosto(Double costo) {
        this.costo = costo;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public String getDescripcion() {
        return descripcion;
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
        final Curso other = (Curso) obj;
        if (!Objects.equals(this.cedula, other.cedula)) {
            return false;
        }
        return true;
    }
    
    
            
}
