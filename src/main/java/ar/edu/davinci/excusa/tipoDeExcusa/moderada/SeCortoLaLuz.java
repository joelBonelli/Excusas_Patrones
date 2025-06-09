package ar.edu.davinci.excusa.tipoDeExcusa.moderada;

import ar.edu.davinci.email.EmailSender;
import ar.edu.davinci.empleado.encargado.Encargado;
import ar.edu.davinci.excusa.Excusa;
import ar.edu.davinci.excusa.tipoDeExcusa.TipoDeExcusa;

public class SeCortoLaLuz extends ExcusaModerada {
    private String titulo = "Se corto la luz en todo el barrio";
    private String emailDestino = "EDESUR@mailfake.com.ar";
    private String asunto = "¿Es verdad que el barrio está sin luz?";


    @Override
    public String descripcion() {
        return titulo;
    }

    @Override
    public void resolverModeradaConcreta(Encargado encargado, String email) {
        EmailSender emailSender = new EmailSender();
        emailSender.enviarEmail(emailDestino, encargado.getEmail(), asunto, titulo);
    }

}
