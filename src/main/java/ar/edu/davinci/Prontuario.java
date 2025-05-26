package ar.edu.davinci;

public class Prontuario {
    private Empleado empleado;
    private int legajo;
    private Excusa excusa;


    public Prontuario(Empleado empleado, int legajo, Excusa excusa) {
        this.empleado = empleado;
        this.legajo = legajo;
        this.excusa = excusa;
    }
}
