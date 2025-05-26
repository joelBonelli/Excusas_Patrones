package ar.edu.davinci;

public class ExcusaInverosimil extends TipoDeExcusa{

    private String titulo;

    public ExcusaInverosimil(String titulo) {
        this.titulo = titulo;
    }
    @Override
    public String motivo() {
        return titulo;
    }

    public String toString() {
        return "Excusa Inverosimil";
    }
}
