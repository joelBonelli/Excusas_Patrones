package ar.edu.davinci.empleado.encargado.tiposDeEncargado;

import ar.edu.davinci.empleado.encargado.Encargado;
import ar.edu.davinci.empleado.encargado.ManejadorExcusas;
import ar.edu.davinci.excusa.Excusa;

public class GerenteRRHH extends Encargado {

    public GerenteRRHH(String nombre, String email, int legajo, ManejadorExcusas siguiente ) {
        super(nombre, email, legajo, siguiente);
    }

    @Override
    public boolean sosGerente() {
        return true;
    }

    @Override
    protected void ejecutarAccion(Excusa excusa) {
        //System.out.println("Excusa Recibida \n" + excusa);
        //System.out.println("Excusa gestionada por: " + this.getNombre() + "\nResultado: excusa aceptada.");

    }


}
