package ar.edu.davinci;

public class Rechazador extends Encargado{
    public Rechazador(String nombre, String email, int legajo, ModoDeResolver modoDeResolver) {
        super(nombre, email, legajo, modoDeResolver);
    }

    @Override
    protected boolean puedeManejar(Excusa excusa) {
        return true;
    }

    @Override
    protected void ejecutarAccion(Excusa excusa) {
        throw new RechazarExcusaException("Excusa Recibida: " + excusa.getDescripcion() +
                "\nExcusa Rechazada: necesitamos pruebas contundentes");
    }
}
