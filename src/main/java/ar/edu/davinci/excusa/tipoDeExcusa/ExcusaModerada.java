package ar.edu.davinci.excusa.tipoDeExcusa;

import ar.edu.davinci.empleado.encargado.Encargado;

public abstract class ExcusaModerada extends TipoDeExcusa {

    public String toString() {
        return "Excusa Moderada: " + descripcion();
    }

    public abstract String descripcion();

    public boolean ManejadaPor(Encargado encargado) {
        return encargado.sosSupervisor();
    }
}
