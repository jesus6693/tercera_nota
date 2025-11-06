package semana07.ejercicio_UFPSO.model;

public class Estudiante extends Curso {
    
    private final String progama;

    public Estudiante(String nombre,String codigo,String programa){
        super(codigo, nombre);
        this.progama=programa;
    }

    public String getProgama() {
        return progama;
    }
    
}
