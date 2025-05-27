package ar.edu.davinci.empleado.prontuario;

import java.util.ArrayList;
import java.util.List;

public class AdministradorDeProntuarios extends AdministradorAbstracto{

    private static AdministradorDeProntuarios administrador;
    private List<Prontuario> prontuarios = new ArrayList<>();

    public static AdministradorDeProntuarios getInstance() {
        if (administrador == null) {
            administrador = new AdministradorDeProntuarios();
        }
        return administrador;
    }

    public void guardarProntuario(Prontuario prontuario ) {
        prontuarios.add(prontuario);
        notificarObservador();
    }
}
