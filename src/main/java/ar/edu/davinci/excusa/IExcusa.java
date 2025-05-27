package ar.edu.davinci.excusa;

import ar.edu.davinci.empleado.Empleado;
import ar.edu.davinci.empleado.encargado.Encargado;
import ar.edu.davinci.excusa.tipoDeExcusa.TipoDeExcusa;

public interface  IExcusa {
    Empleado getEmpleado();
    TipoDeExcusa getTipoDeExcusa();
    String toString();
    String getDescripcion();
    boolean puedeSerManejaPor(Encargado encargado);
}
