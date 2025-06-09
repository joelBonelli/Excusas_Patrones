package ar.edu.davinci.excusa.tipoDeExcusa.moderada;

import ar.edu.davinci.email.EmailSender;
import ar.edu.davinci.empleado.encargado.Encargado;
import ar.edu.davinci.excusa.Excusa;
import ar.edu.davinci.excusa.tipoDeExcusa.TipoDeExcusa;

public class CuideAUnFamiliar extends ExcusaModerada {
    private String titulo = "Tuve que cuidar a un familiar";
    private String asunto = "Asunto Familiar";
    private String cuerpo = "¿Se encuentra todo bien?";

    @Override
    public String descripcion() {
        return titulo;
    }

    @Override
    public void resolverModeradaConcreta(Encargado encargado, String email) {
        EmailSender emailSender = new EmailSender();
        emailSender.enviarEmail(email, encargado.getEmail(), asunto, cuerpo);
    }
}
