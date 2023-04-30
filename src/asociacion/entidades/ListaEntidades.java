package asociacion.entidades;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Andres
 */
public class ListaEntidades {
    private static List<Curso> cursos = new ArrayList<Curso>();

    public static List<Curso> getCursos() {
        return cursos;
    }
}
