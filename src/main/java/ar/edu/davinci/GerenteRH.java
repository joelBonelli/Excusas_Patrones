package ar.edu.davinci;

public class GerenteRH extends Encargado {

    public GerenteRH(String nombre, String email, int legajo, ModoDeResolver modoDeResolver ) {
        super(nombre, email, legajo, modoDeResolver);
    }

    @Override
    protected boolean puedeManejar(Excusa excusa) {
        return excusa.getTipoDeExcusa() instanceof ExcusaCompleja;
    }

    @Override
    protected void ejecutarAccion(Excusa excusa) {
        System.out.println("Excusa Recibida: " + excusa.getDescripcion() +"\n" + excusa.toString());
        System.out.println("Excusa gestionada por: " + this.getNombre() + " -- Resultado: excusa aceptada.");

    }


}
