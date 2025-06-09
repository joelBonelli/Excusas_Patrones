package ar.edu.davinci.excusa;

import ar.edu.davinci.empleado.Empleado;
import ar.edu.davinci.empleado.encargado.Encargado;
import ar.edu.davinci.excusa.tipoDeExcusa.TipoDeExcusa;

public class Excusa implements IExcusa {

    private Empleado empleado;
    private TipoDeExcusa tipoDeExcusa;

    public Excusa(Empleado empleado, TipoDeExcusa tipoDeExcusa) {
        this.empleado = empleado;
        this.tipoDeExcusa = tipoDeExcusa;
    }

    @Override
    public String obtenerNombreEmpleado() {
        return this.empleado.getNombre();
    }

    @Override
    public String obtenerEmailEmpleado() {
        return this.empleado.getEmail();
    }

    @Override
    public int obtenerLagajoEmpleado() {
        return this.empleado.getLegajo();
    }

    @Override
    public String getTipoDeExcusa() {
        return this.tipoDeExcusa.toString();
    }

    @Override
    public String toString() {
        return this.getTipoDeExcusa();
    }

    @Override
    public boolean puedeSerManejaPor(Encargado encargado) {
        return this.tipoDeExcusa.ManejadaPor(encargado);
    }

    public void excusaModeradaConcreta(Encargado encargado) {
        this.tipoDeExcusa.resolverModeradaConcreta(encargado, this.obtenerEmailEmpleado());
    }
}
