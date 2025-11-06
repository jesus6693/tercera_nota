package semana07.ejercicio_UFPSO.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Curso {
    private final String codigo;
    private final String nombre;
    private final List<UnidadTematica> unidades = new ArrayList<>();
    private final List<Estudiante> inscritos = new ArrayList<>();

    public Curso(String codigo,String nombre){
        this.codigo=codigo;
        this.nombre=nombre;
    }

    public void agregarUnidad(String titulo,int semanas){
        unidades.add(new UnidadTematica(titulo,semanas));
    }

    public void inscribir (Estudiante estudiante){
        Objects.requireNonNull(estudiante);
        if (!inscritos.contains(estudiante) ) {
            inscritos.add(estudiante);
        }
    }

    public void desinscribir(Estudiante estudiante){
        inscritos.remove(estudiante);
    }

    public List<Estudiante> getInscritos() {
        return inscritos;
    }

    public List<UnidadTematica> getUnidades() {
        return unidades;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    @Override
    public String toString(){
        return "curso{"+codigo+"-"+nombre+", unidades"+unidades+", inscritos"+inscritos.size();
    }
}
