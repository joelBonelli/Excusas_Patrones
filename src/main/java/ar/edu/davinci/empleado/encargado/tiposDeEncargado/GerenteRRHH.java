package ar.edu.davinci.empleado.encargado.tiposDeEncargado;

import ar.edu.davinci.empleado.encargado.Encargado;
import ar.edu.davinci.excusa.Excusa;

public class GerenteRRHH extends Encargado {

    public GerenteRRHH(String nombre, String email, int legajo, Encargado encargado ) {
        super(nombre, email, legajo, encargado);
    }

    @Override
    protected boolean puedeManejar(Excusa excusa) {
        return excusa.puedeSerManejaPor(this);
        //return excusa.getTipoDeExcusa() instanceof ExcusaCompleja;
    }

    @Override
    public boolean sosGerente() {
        return true;
    }

    @Override
    protected void ejecutarAccion(Excusa excusa) {
        System.out.println("Excusa Recibida: " + excusa.getDescripcion() +"\n" + excusa.toString());
        System.out.println("Excusa gestionada por: " + this.getNombre() + "\nResultado: excusa aceptada.");

    }


}
