package asociacion.entidades;

import java.util.List;

/**
 *
 * @author Andres
 */
public class Profesor {
    private String nombre;
    private List<Curso> cursos;

    public Profesor(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }
}