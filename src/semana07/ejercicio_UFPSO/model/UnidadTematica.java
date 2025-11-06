package semana07.ejercicio_UFPSO.model;

public class UnidadTematica {
    private final String titulo;
    private final int semanas;

    public UnidadTematica(String titulo, int semanas){
        this.titulo=titulo;
        this.semanas=semanas;
    }

    @Override
    public String toString(){
        return titulo+ "()"+semanas+" semamas";
    }

}
