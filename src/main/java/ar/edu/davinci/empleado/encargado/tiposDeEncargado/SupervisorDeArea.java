package ar.edu.davinci.empleado.encargado.tiposDeEncargado;

import ar.edu.davinci.email.EmailSender;
import ar.edu.davinci.empleado.encargado.modoDeResolver.ModoDeResolver;
import ar.edu.davinci.empleado.encargado.Encargado;
import ar.edu.davinci.excusa.Excusa;
import ar.edu.davinci.excusa.tipoDeExcusa.ExcusaModerada;
import ar.edu.davinci.excusa.tipoDeExcusa.moderada.SeCortoLaLuz;

public class SupervisorDeArea extends Encargado {
    private String asunto = "Supervisor de area";
    private String cuerpo = "¿Todo bien?";
    private String asuntoEdesur = "No hay luz";
    private String cuerpoEdesur = "¿Es verdad que el barrio está sin luz?";
    private String emailEdesur = "EDESUR@mailfake.com.ar";

    public SupervisorDeArea(String nombre, String email, int legajo, ModoDeResolver modoDeResolver) {
        super(nombre, email, legajo, modoDeResolver);
    }

    @Override
    protected boolean puedeManejar(Excusa excusa) {
        return excusa.puedeSerManejaPor(this);
        //return excusa.getTipoDeExcusa() instanceof ExcusaModerada;
    }

    @Override
    public boolean sosSupervisor() {
        return true;
    }

    @Override
    protected void ejecutarAccion(Excusa excusa) {
        System.out.println("Excusa Recibida: " + excusa.getDescripcion() +"\n" + excusa.toString());
        String emailEmpleado = excusa.getEmpleado().getEmail();
        EmailSender emailSender = new EmailSender();

        if(excusa.sosSeCortoLaLuz()){
            System.out.println("Excusa gestionada por: " + this.getNombre());
            emailSender.enviarEmail(emailEdesur, emailEmpleado, asuntoEdesur, cuerpoEdesur);
        } else {
            System.out.println("Excusa gestionada por: " + this.getNombre());
            emailSender.enviarEmail(excusa.getEmpleado().getEmail(), this.getEmail(), asunto, cuerpo);
        }
    }


}
