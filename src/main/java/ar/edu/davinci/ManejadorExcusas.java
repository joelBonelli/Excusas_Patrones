package ar.edu.davinci;

public interface ManejadorExcusas {

    void manejarExcusa(Excusa excusa);
    void setSiguiente(Encargado encargado);
    Encargado getSiguiente();
    void procesarExcusa(Excusa excusa);
}
