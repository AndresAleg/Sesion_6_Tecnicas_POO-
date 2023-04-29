package asociacion.entidades;

/**
 *
 * @author Andres
 */
public class Curso {
    private String codigo;
    private String nombre;
    private Integer creditos;
    private Estudiante[] estudiantes;
    private Profesor[] profesores;
    
    public Curso(
            String codigo,
            String nombre,
            Integer creditos){
        this.codigo = codigo;
        this.nombre = nombre;
        this.creditos = creditos;
        this.estudiantes = new Estudiante[30];
        this.profesores = new Profesor[2];
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCreditos() {
        return creditos;
    }

    public void setCreditos(Integer creditos) {
        this.creditos = creditos;
    }

    public Estudiante[] getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(Estudiante[] estudiantes) {
        this.estudiantes = estudiantes;
    }

    public Profesor[] getProfesores() {
        return profesores;
    }

    public void setProfesores(Profesor[] profesores) {
        this.profesores = profesores;
    }
}
