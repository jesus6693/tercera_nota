package semana07.ejercicio_UFPSO;

import semana07.ejercicio_UFPSO.model.Curso;
import semana07.ejercicio_UFPSO.model.Estudiante;
import semana07.ejercicio_UFPSO.model.Profesor;
import semana07.ejercicio_UFPSO.model.Proyecto;

public class Main {
    public static void main(String[] args) {
        Profesor profesor = new Profesor("", "yisus", "ing sistemas");
        Estudiante estudiante1 = new Estudiante("paula", null, null);
        Estudiante estudiante2 = new Estudiante("paula", null, null);

        Curso programacion = new Curso("12122", "programacio II");
        profesor.dictar(programacion);

        // composicion
        programacion.agregarUnidad("herencia", 2);
        programacion.agregarUnidad("polimorfismo", 4);
        //agregacion
        programacion.inscribir(estudiante1);
        programacion.inscribir(estudiante2);

        //asociacion
        Proyecto proyecto = new Proyecto("examen final ", estudiante2);
        profesor.asesorar(proyecto);

        System.out.println(programacion);
    }
}
