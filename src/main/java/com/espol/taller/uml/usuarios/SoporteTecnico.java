package com.espol.taller.uml.usuarios;

import com.espol.taller.uml.sistema.Incidente;

public class SoporteTecnico extends Usuario{
    public void brindarAsistencia(Usuario usuario){
        Incidente incidente = usuario.incidentes.get(0);
        //incidente.setTipo();
        //incidente.setEstado();
    }
    
    public void resolverProblemaTecnico(Usuario usuario){}
    
    public void derivarProblemaDeGestion(Administrador administrador){}
}
