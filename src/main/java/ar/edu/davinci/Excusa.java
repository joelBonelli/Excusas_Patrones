package ar.edu.davinci;

public class Excusa implements IExcusa{

    private Empleado empleado;
    private TipoDeExcusa tipoDeExcusa;

    public Excusa(Empleado empleado, TipoDeExcusa tipoDeExcusa) {
        this.empleado = empleado;
        this.tipoDeExcusa = tipoDeExcusa;
    }

    @Override
    public Empleado getEmpleado() {
        return this.empleado;
    }

    @Override
    public TipoDeExcusa getTipoDeExcusa() {
        return this.tipoDeExcusa;
    }

    @Override
    public String toString() {
        return "Empleado: "+ this.getEmpleado().getNombre() +"\nTipo De Excusa: " + tipoDeExcusa.toString();
    }

    @Override
    public String getDescripcion(){
        return this.tipoDeExcusa.motivo();
    }
}
