package ar.edu.davinci.excusa.tipoDeExcusa;

import ar.edu.davinci.empleado.encargado.Encargado;

public class ExcusaInverosimil extends TipoDeExcusa {

    @Override
    public String toString() {
        return "Excusa Inverosimil";
    }

    public boolean ManejadaPor(Encargado encargado) {
        return encargado.sosCEO();
    }

}
