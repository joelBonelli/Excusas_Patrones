package ar.edu.davinci.empleado.encargado.modoDeResolver.tipos;

import ar.edu.davinci.empleado.encargado.Encargado;
import ar.edu.davinci.empleado.encargado.modoDeResolver.ModoDeResolver;
import ar.edu.davinci.excusa.Excusa;

public class Vago extends ModoDeResolver {

    @Override
    public void resolver(Encargado encargado, Excusa excusa) {

        if(encargado.getSiguiente() !=null){
            encargado.getSiguiente().manejarExcusa(excusa);
        }
    }
}
