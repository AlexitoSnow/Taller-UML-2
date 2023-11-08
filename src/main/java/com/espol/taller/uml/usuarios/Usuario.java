package com.espol.taller.uml.usuarios;

import com.espol.taller.uml.sistema.Incidente;
import java.util.List;

public class Usuario {
    protected String usuario, contrasena;
    protected String nombre, apellido;
    
    protected List<Incidente> incidentes;
    
    protected boolean logIn(){
        return true;
    }
    
    protected boolean logOut(){
        return true;
    }
}
