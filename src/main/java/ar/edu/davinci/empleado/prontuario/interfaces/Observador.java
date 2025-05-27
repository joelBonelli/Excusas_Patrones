package ar.edu.davinci.empleado.prontuario.interfaces;

import ar.edu.davinci.empleado.prontuario.Prontuario;

public interface Observador {
    void notificar(Prontuario prontuario);
}
