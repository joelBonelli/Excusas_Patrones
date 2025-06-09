package ar.edu.davinci.excusa.tipoDeExcusa;

import ar.edu.davinci.empleado.encargado.Encargado;

public class ExcusaCompleja extends TipoDeExcusa {

    @Override
    public String toString() {
        return "Excusa Compleja";
    }

    public boolean ManejadaPor(Encargado encargado) {
        return encargado.sosGerente();
    }

}
