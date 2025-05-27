package ar.edu.davinci.empleado.encargado.tiposDeEncargado;

import ar.edu.davinci.email.EmailSender;
import ar.edu.davinci.empleado.encargado.modoDeResolver.ModoDeResolver;
import ar.edu.davinci.empleado.encargado.Encargado;
import ar.edu.davinci.excusa.Excusa;

public class Recepcionista extends Encargado {

    private String asunto = "Motivo demora";
    private String cuerpo = "La licencia fue aceptada";

    public Recepcionista(String nombre, String email, int legajo, ModoDeResolver modoDeResolver) {
        super(nombre, email, legajo, modoDeResolver);
    }


    @Override
    protected boolean puedeManejar(Excusa excusa) {
        //return excusa.getTipoDeExcusa() instanceof ExcusaTrivial;
        //return excusa.puedeSerManejaPor(this);
        return excusa.puedeSerManejaPor(this);
    }

    @Override
    public boolean sosRecepcionista(){
        return true;
    }


    @Override
    protected void ejecutarAccion(Excusa excusa) {
        System.out.println("Excusa Recibida: " + excusa.getDescripcion() +"\n" + excusa.toString());
        System.out.println("Excusa gestionada por: " + this.getNombre());
        EmailSender emailSender = new EmailSender();
        emailSender.enviarEmail(excusa.getEmpleado().getEmail(), this.getEmail(), asunto, cuerpo );
    }




}
