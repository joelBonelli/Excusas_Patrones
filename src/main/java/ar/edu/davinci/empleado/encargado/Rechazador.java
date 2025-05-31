package ar.edu.davinci.empleado.encargado;

import ar.edu.davinci.excepcion.RechazarExcusaException;
import ar.edu.davinci.excusa.Excusa;

public  class  Rechazador implements ManejadorExcusas {
    public Rechazador() {}

    @Override
    public void manejarExcusa(Excusa excusa) {
        procesarExcusa(excusa);
    }

    @Override
    public Encargado getSiguiente() {
        return null;
    }

    @Override
    public void procesarExcusa(Excusa excusa) {
        throw new RechazarExcusaException("Excusa Recibida: " + excusa.getDescripcion() +
                "\nExcusa Rechazada: necesitamos pruebas contundentes");
    }


    @Override
    public boolean sosRecepcionista() {
        return false;
    }

    @Override
    public boolean sosSupervisor() {
        return false;
    }

    @Override
    public boolean sosGerente() {
        return false;
    }

    @Override
    public boolean sosCEO() {
        return false;
    }
}