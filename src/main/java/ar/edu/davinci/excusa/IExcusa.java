package ar.edu.davinci.excusa;

import ar.edu.davinci.empleado.Empleado;
import ar.edu.davinci.empleado.encargado.Encargado;
import ar.edu.davinci.excusa.tipoDeExcusa.TipoDeExcusa;

public interface  IExcusa {

    String obtenerNombreEmpleado();
    String obtenerEmailEmpleado();
    int obtenerLagajoEmpleado();
    String getTipoDeExcusa();
    String toString();
    boolean puedeSerManejaPor(Encargado encargado);
}
