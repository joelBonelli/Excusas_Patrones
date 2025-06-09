package ar.edu.davinci.empleado.encargado;

import ar.edu.davinci.excusa.Excusa;

public interface ManejadorExcusas {

    void manejarExcusa(Excusa excusa);
    void procesarExcusa(Excusa excusa);
    ManejadorExcusas getSiguiente();
    boolean puedeManejar(Excusa excusa);
    boolean sosRecepcionista();
    boolean sosSupervisor();
    boolean sosGerente();
    boolean sosCEO();
}
