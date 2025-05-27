package ar.edu.davinci.excepcion;

public class RechazarExcusaException extends RuntimeException {
    public RechazarExcusaException(String mensaje) {
        super(mensaje);
    }
}
