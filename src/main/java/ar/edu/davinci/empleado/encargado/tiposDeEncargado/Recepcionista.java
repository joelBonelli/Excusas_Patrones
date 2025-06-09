package ar.edu.davinci.empleado.encargado.tiposDeEncargado;

import ar.edu.davinci.email.EmailSender;
import ar.edu.davinci.empleado.encargado.Encargado;
import ar.edu.davinci.empleado.encargado.ManejadorExcusas;
import ar.edu.davinci.excusa.Excusa;

public class Recepcionista extends Encargado {

    private String asunto = "Motivo demora";
    private String cuerpo = "La licencia fue aceptada";

    public Recepcionista(String nombre, String email, int legajo, ManejadorExcusas siguiente) {
        super(nombre, email, legajo, siguiente);
    }

    @Override
    public boolean sosRecepcionista(){
        return true;
    }

    @Override
    protected void ejecutarAccion(Excusa excusa) {
        //System.out.println("Excusa Recibida \n" + excusa);
        //System.out.println("Excusa gestionada por: " + this.getNombre());
        EmailSender emailSender = new EmailSender();
        emailSender.enviarEmail(excusa.obtenerEmailEmpleado(), this.getEmail(), asunto, cuerpo );
    }




}
