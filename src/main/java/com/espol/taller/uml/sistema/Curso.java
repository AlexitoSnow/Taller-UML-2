package com.espol.taller.uml.sistema;

import com.espol.taller.uml.actividades.ActividadSumativa;
import com.espol.taller.uml.usuarios.academicos.Estudiante;
import com.espol.taller.uml.usuarios.academicos.Profesor;
import java.util.List;

public class Curso {
    private String id, nombre;
    private boolean estadoDisponible;
    
    private List<Estudiante> estudiantesInscritos;
    private List<Estudiante> estudiantesEnEsperaDeInscripcion;
    
    private Profesor responsable;
    
    private List<Foro> foros;
    
    private List<ActividadSumativa> actividadesSumativas;

    public void setResponsable(Profesor responsable) {
        this.responsable = responsable;
    }

    public void setEstudiantesInscritos(List<Estudiante> estudiantesInscritos) {
        this.estudiantesInscritos = estudiantesInscritos;
    }

    public void setEstudiantesEnEsperaDeInscripcion(List<Estudiante> estudiantesEnEsperaDeInscripcion) {
        this.estudiantesEnEsperaDeInscripcion = estudiantesEnEsperaDeInscripcion;
    }
    
    public void addEstudianteInscrito(Estudiante estudiante){
        estudiantesInscritos.add(estudiante);
    }
    
    public void addEstudianteEnEsperaDeInscripcion(Estudiante estudiante){
        estudiantesEnEsperaDeInscripcion.add(estudiante);
    }
}
