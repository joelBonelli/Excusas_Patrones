package ar.edu.davinci.excusa.tipoDeExcusa;

import ar.edu.davinci.empleado.encargado.Encargado;

public class ExcusaInverosimil extends TipoDeExcusa {

    private String titulo;

    public ExcusaInverosimil(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    @Override
    public boolean ManejadaPor(Encargado encargado) {
        return encargado.sosCEO();
    }

    public String toString() {
        return "Excusa Inverosimil: " + getTitulo() ;
    }
}
