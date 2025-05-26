package ar.edu.davinci;

public interface AdministradorObservable {
    void agregarObservador(CEO ceo);
    void removerObservador(CEO ceo);
    void notificarObservador();
}
