package ar.edu.davinci.empleado.prontuario.interfaces;

import ar.edu.davinci.empleado.encargado.tiposDeEncargado.CEO;

public interface AdministradorObservable {
    void agregarObservador(CEO ceo);
    void removerObservador(CEO ceo);
    void notificarObservador();
}
