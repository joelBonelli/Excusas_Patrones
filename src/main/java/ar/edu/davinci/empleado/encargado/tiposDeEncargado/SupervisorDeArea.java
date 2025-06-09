package ar.edu.davinci.empleado.encargado.tiposDeEncargado;

import ar.edu.davinci.email.EmailSender;
import ar.edu.davinci.empleado.encargado.Encargado;
import ar.edu.davinci.empleado.encargado.ManejadorExcusas;
import ar.edu.davinci.excusa.Excusa;
import ar.edu.davinci.excusa.tipoDeExcusa.ITipoDeExcusa;
import ar.edu.davinci.excusa.tipoDeExcusa.TipoDeExcusa;

public class SupervisorDeArea extends Encargado {

    public SupervisorDeArea(String nombre, String email, int legajo, ManejadorExcusas siguiente) {
        super(nombre, email, legajo, siguiente);
    }

    @Override
    public boolean sosSupervisor() {
        return true;
    }

    @Override
    protected void ejecutarAccion(Excusa excusa) {
        excusa.excusaModeradaConcreta(this);
    }
}
