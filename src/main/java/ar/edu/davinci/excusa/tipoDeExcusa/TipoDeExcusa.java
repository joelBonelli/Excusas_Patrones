package ar.edu.davinci.excusa.tipoDeExcusa;

import ar.edu.davinci.empleado.encargado.Encargado;

public abstract class TipoDeExcusa implements ITipoDeExcusa {

    public void resolverModeradaConcreta(Encargado encargado, String email) {}

}
