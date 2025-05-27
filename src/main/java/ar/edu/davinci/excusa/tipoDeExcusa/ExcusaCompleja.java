package ar.edu.davinci.excusa.tipoDeExcusa;

import ar.edu.davinci.empleado.encargado.Encargado;

public class ExcusaCompleja extends TipoDeExcusa {

    public String toString() {
        return "Excusa Compleja";
    }

    @Override
    public boolean ManejadaPor(Encargado encargado) {
        return encargado.sosGerente();
    }
}
