package ar.edu.davinci.empleado.prontuario;

import ar.edu.davinci.empleado.Empleado;
import ar.edu.davinci.excusa.Excusa;

public class Prontuario {
    private Empleado empleado;
    private int legajo;
    private Excusa excusa;


    public Prontuario(Empleado empleado, int legajo, Excusa excusa) {
        this.empleado = empleado;
        this.legajo = legajo;
        this.excusa = excusa;
    }

    public String  getEmpleado() {
        return empleado.getNombre() + " - "+ empleado.getEmail();
    }

    public String getExcusa() {
        return excusa.getDescripcion();
    }
}
