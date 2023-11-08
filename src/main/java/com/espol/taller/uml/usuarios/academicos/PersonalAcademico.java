package com.espol.taller.uml.usuarios.academicos;

import com.espol.taller.uml.sistema.Foro;
import com.espol.taller.uml.sistema.Incidente;
import com.espol.taller.uml.usuarios.Usuario;
import java.util.List;

public class PersonalAcademico extends Usuario{
    
    protected List<Incidente> incidentes;
    
    public void reportarError(String email, String contenido){
        Incidente incidente = new Incidente();
        incidentes.add(incidente);
        //enviarIncidente()
    }
    
    public void solicitarAsesoramientoDelSistema(String email, String contenido){
        
    }
    
    public void comentarEnForo(Foro foro, String comentario){
        
    }
}
