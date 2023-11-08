package com.espol.taller.uml.usuarios.academicos;

import com.espol.taller.uml.actividades.ActividadSumativa;
import com.espol.taller.uml.sistema.Curso;
import com.espol.taller.uml.sistema.Foro;
import java.util.List;

public class Profesor extends PersonalAcademico{
    
    private List<Curso> cursosACargo;
    
    public void cargarActividadSumativa(Curso curso, ActividadSumativa actividadSumativa){}
    
    public void calificarActividadSumativa(Curso curso, Estudiante estudiante, ActividadSumativa actividadSumativa){}
    
    public void aceptarInscripcion(Curso curso, String usuarioEstudiante){}
    
    public void crearNuevoForo(Foro foro){}
}
