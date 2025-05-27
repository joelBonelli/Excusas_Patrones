package ar.edu.davinci.empleado.encargado;

import ar.edu.davinci.excusa.Excusa;

public interface ManejadorExcusas {

    void manejarExcusa(Excusa excusa);
    void setSiguiente(Encargado encargado);
    Encargado getSiguiente();
    void procesarExcusa(Excusa excusa);
    boolean sosRecepcionista();
    boolean sosSupervisor();
    boolean sosGerente();
    boolean sosCEO();
}
