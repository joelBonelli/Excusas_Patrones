package ar.edu.davinci.empleado.encargado.modoDeResolver.tipos;

import ar.edu.davinci.CTO;
import ar.edu.davinci.email.EmailSender;
import ar.edu.davinci.empleado.Empleado;
import ar.edu.davinci.empleado.encargado.Encargado;
import ar.edu.davinci.empleado.encargado.modoDeResolver.ModoDeResolver;
import ar.edu.davinci.excusa.Excusa;

public class                             Productivo extends ModoDeResolver {
    private String asunto = "Mi querido CTO";
    private String cuerpo = "Mire que bien trabajo";

    @Override
    public void resolver(Encargado encargado, Excusa excusa) {
        EmailSender emailSender = new EmailSender();
        Empleado CTO = new CTO();
        emailSender.enviarEmail(CTO.getEmail(), encargado.getEmail(), asunto, cuerpo);
        encargado.procesarExcusa(excusa);
    }
}
