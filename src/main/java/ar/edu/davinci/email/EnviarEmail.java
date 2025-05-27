package ar.edu.davinci.email;

public interface EnviarEmail {

    void enviarEmail(String emailDestino, String emailOrigen, String emailAsunto, String emailCuerpo);
}
