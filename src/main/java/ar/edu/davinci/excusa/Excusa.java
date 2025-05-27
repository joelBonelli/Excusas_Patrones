package ar.edu.davinci.excusa;

import ar.edu.davinci.empleado.Empleado;
import ar.edu.davinci.empleado.encargado.Encargado;
import ar.edu.davinci.empleado.encargado.tiposDeEncargado.Recepcionista;
import ar.edu.davinci.excusa.tipoDeExcusa.ExcusaModerada;
import ar.edu.davinci.excusa.tipoDeExcusa.TipoDeExcusa;
import ar.edu.davinci.excusa.tipoDeExcusa.moderada.SeCortoLaLuz;

public class Excusa implements IExcusa {

    private Empleado empleado;
    private TipoDeExcusa tipoDeExcusa;

    public Excusa(Empleado empleado, TipoDeExcusa tipoDeExcusa) {
        this.empleado = empleado;
        this.tipoDeExcusa = tipoDeExcusa;
    }

    @Override
    public Empleado getEmpleado() {
        return this.empleado;
    }

    @Override
    public TipoDeExcusa getTipoDeExcusa() {
        return this.tipoDeExcusa;
    }

    @Override
    public String toString() {
        return "Empleado: "+ this.getEmpleado().getNombre() +"\nTipo De Excusa: " + tipoDeExcusa.toString();
    }

    @Override
    public String getDescripcion(){
        return this.tipoDeExcusa.toString();
    }

    @Override
    public boolean puedeSerManejaPor(Encargado encargado) {
        return tipoDeExcusa.ManejadaPor(encargado);
    }

    public boolean sosSeCortoLaLuz() {
        return tipoDeExcusa.sosSeCortoLaLuz();
    }
}
