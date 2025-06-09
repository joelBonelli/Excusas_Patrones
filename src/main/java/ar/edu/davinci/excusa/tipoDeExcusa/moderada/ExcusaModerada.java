package ar.edu.davinci.excusa.tipoDeExcusa.moderada;

import ar.edu.davinci.empleado.encargado.Encargado;
import ar.edu.davinci.excusa.tipoDeExcusa.TipoDeExcusa;

public abstract class ExcusaModerada extends TipoDeExcusa {

    @Override
    public String toString() {
        return "Excusa Moderada: " + descripcion();
    }

    public abstract String descripcion();

    public boolean ManejadaPor(Encargado encargado) {
        return encargado.sosSupervisor();
    }

}
