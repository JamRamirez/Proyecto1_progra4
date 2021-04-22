package logic;

import java.util.Objects;

public class Grupo {
    
private int num_grupo;
private int id_curso;
private String profesor;
private String dias;
private String horario;

public Grupo(){
    
}

    public int getNum_grupo() {
        return num_grupo;
    }

    public int getId_curso() {
        return id_curso;
    }

    public String getProfesor() {
        return profesor;
    }

    public String getDias() {
        return dias;
    }

    public String getHorario() {
        return horario;
    }

    public void setNum_grupo(int num_grupo) {
        this.num_grupo = num_grupo;
    }

    public void setId_curso(int id_curso) {
        this.id_curso = id_curso;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public void setDias(String dias) {
        this.dias = dias;
    }

    public void setHorario(String horario) {
        this.horario = horario;
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
        final Grupo other = (Grupo) obj;
        if (this.num_grupo != other.num_grupo) {
            return false;
        }
        if (this.id_curso != other.id_curso) {
            return false;
        }
        return true;
    }

    
    
}
