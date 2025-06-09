package ar.edu.davinci.empleado;

import ar.edu.davinci.empleado.encargado.LineaDeEncargados;
import ar.edu.davinci.excusa.Excusa;
import ar.edu.davinci.excusa.tipoDeExcusa.TipoDeExcusa;

public class Empleado {
    private String nombre;
    private String email;
    private int legajo;

    public Empleado(String nombre, String email, int legajo) {
        this.nombre = nombre;
        this.email = email;
        this.legajo = legajo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public int getLegajo() {
        return legajo;
    }

    public Excusa generarExcusa(TipoDeExcusa tipoDeExcusa) {
        Excusa excusa = new Excusa(this, tipoDeExcusa);
        LineaDeEncargados lineaDeEncargados = new LineaDeEncargados();
        lineaDeEncargados.empezarLinea(excusa);
        return excusa;
    }


}
