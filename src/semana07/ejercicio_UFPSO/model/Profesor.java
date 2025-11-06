package semana07.ejercicio_UFPSO.model;

import java.util.ArrayList;
import java.util.List;

public class Profesor extends Persona {
    
    private final String departamento;
    private final List<Curso> cursos =new ArrayList<>();

    public Profesor(String id, String nombre, String departamento){
       super(id, nombre);
        this.departamento=departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public List<Curso> getCursos() {
        return List.copyOf(cursos);
    }

 

    public void dictar(Curso curso){
        if (!cursos.contains(cursos)) {
            cursos.add(curso);
        }
    }

    public void asesorar( Proyecto proyecto){
        System.out.println(getNombre()+" ahora asesora el proyecto"+proyecto.getTitulo());
    }
}
