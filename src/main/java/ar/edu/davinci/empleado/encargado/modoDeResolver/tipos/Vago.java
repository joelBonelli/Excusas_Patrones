package ar.edu.davinci.empleado.encargado.modoDeResolver.tipos;

import ar.edu.davinci.empleado.encargado.Encargado;
import ar.edu.davinci.empleado.encargado.ManejadorExcusas;
import ar.edu.davinci.empleado.encargado.Rechazador;
import ar.edu.davinci.empleado.encargado.modoDeResolver.IModoDeResolver;
import ar.edu.davinci.excusa.Excusa;

public class Vago implements IModoDeResolver {

    @Override
    public void resolver(ManejadorExcusas manejadorExcusas, Excusa excusa) {
        manejadorExcusas.getSiguiente().manejarExcusa(excusa);
    }
}
