package ar.edu.davinci.empleado.encargado.modoDeResolver;

import ar.edu.davinci.empleado.encargado.Encargado;
import ar.edu.davinci.empleado.encargado.ManejadorExcusas;
import ar.edu.davinci.excusa.Excusa;

public interface IModoDeResolver {

    void resolver(ManejadorExcusas manejadorExcusas, Excusa excusa);
}
