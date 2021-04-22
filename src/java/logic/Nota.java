package logic;

import java.util.Objects;

public class Nota {
   private Usuario estudiante;
   private Grupo clase;
   float nota;
   
   public Nota(){
       
   }

    public Usuario getEstudiante() {
        return estudiante;
    }

    public Grupo getClase() {
        return clase;
    }

    public float getNota() {
        return nota;
    }

    public void setEstudiante(Usuario estudiante) {
        this.estudiante = estudiante;
    }

    public void setClase(Grupo clase) {
        this.clase = clase;
    }

    public void setNota(float nota) {
        this.nota = nota;
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
        final Nota other = (Nota) obj;
        if (!Objects.equals(this.estudiante, other.estudiante)) {
            return false;
        }
        if (!Objects.equals(this.clase, other.clase)) {
            return false;
        }
        return true;
    }
   
}
