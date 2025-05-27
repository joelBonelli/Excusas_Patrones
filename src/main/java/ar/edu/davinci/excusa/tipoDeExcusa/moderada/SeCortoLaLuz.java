package ar.edu.davinci.excusa.tipoDeExcusa.moderada;

import ar.edu.davinci.empleado.encargado.Encargado;
import ar.edu.davinci.excusa.tipoDeExcusa.ExcusaModerada;

public class SeCortoLaLuz extends ExcusaModerada {
    private String titulo = "Se corto la luz en todo el barrio";

    @Override
    public String descripcion() {
        return titulo;
    }

    @Override
    public boolean sosSeCortoLaLuz() {
        return true;
    }
}
