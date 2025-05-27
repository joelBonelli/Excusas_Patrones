package ar.edu.davinci.empleado.encargado.tiposDeEncargado;

import ar.edu.davinci.empleado.encargado.modoDeResolver.ModoDeResolver;
import ar.edu.davinci.excepcion.RechazarExcusaException;
import ar.edu.davinci.empleado.encargado.Encargado;
import ar.edu.davinci.excusa.Excusa;

public class Rechazador extends Encargado {
    public Rechazador(String nombre, String email, int legajo, ModoDeResolver modoDeResolver) {
        super(nombre, email, legajo, modoDeResolver);
    }

    @Override
    protected boolean puedeManejar(Excusa excusa) {
        return true;
    }

    @Override
    protected void ejecutarAccion(Excusa excusa) {
        throw new RechazarExcusaException("Excusa Recibida: " + excusa.getDescripcion() +
                "\nExcusa Rechazada: necesitamos pruebas contundentes");
    }
}
