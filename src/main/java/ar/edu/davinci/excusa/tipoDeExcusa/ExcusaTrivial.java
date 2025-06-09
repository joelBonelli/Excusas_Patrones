package ar.edu.davinci.excusa.tipoDeExcusa;

import ar.edu.davinci.empleado.encargado.Encargado;

public class ExcusaTrivial extends TipoDeExcusa {

    @Override
    public String toString() {
        return "Excusa Trivial";
    }

    public boolean ManejadaPor(Encargado encargado) {
        return encargado.sosRecepcionista();
    }

}
