package com.espol.taller.uml.sistema;

import com.espol.taller.uml.usuarios.Usuario;
import com.espol.taller.uml.usuarios.academicos.PersonalAcademico;
import java.time.LocalDateTime;
import java.util.List;

public class Incidente {
    protected int id;
    protected LocalDateTime fecha_reportado;
    protected String estado, titulo, descripcion;
    protected List<String> log_actualizaciones;
    protected LocalDateTime fecha_cerrado;
    protected String tipo;
    
    private Usuario responsable;
    
    protected PersonalAcademico beneficiario;
}
