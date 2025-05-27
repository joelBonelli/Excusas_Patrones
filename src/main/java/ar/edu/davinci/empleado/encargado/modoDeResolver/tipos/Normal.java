package ar.edu.davinci.empleado.encargado.modoDeResolver.tipos;

import ar.edu.davinci.empleado.encargado.Encargado;
import ar.edu.davinci.empleado.encargado.modoDeResolver.ModoDeResolver;
import ar.edu.davinci.excusa.Excusa;

public class Normal extends ModoDeResolver {


    @Override
    public void resolver(Encargado encargado, Excusa excusa) {
        encargado.procesarExcusa(excusa);
    }
}
