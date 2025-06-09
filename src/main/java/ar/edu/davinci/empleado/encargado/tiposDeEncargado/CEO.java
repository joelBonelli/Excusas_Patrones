package ar.edu.davinci.empleado.encargado.tiposDeEncargado;

import ar.edu.davinci.email.EmailSender;
import ar.edu.davinci.empleado.Empleado;
import ar.edu.davinci.empleado.encargado.Encargado;
import ar.edu.davinci.empleado.encargado.ManejadorExcusas;
import ar.edu.davinci.empleado.prontuario.AdministradorDeProntuarios;
import ar.edu.davinci.empleado.prontuario.interfaces.Observador;
import ar.edu.davinci.empleado.prontuario.Prontuario;
import ar.edu.davinci.excusa.Excusa;

public class CEO extends Encargado implements Observador {
    private String asunto = "Aprobado por creatividad";
    private String cuerpo = "Buen descanzo";

    public CEO(String nombre, String email, int legajo, ManejadorExcusas siguiente) {
        super(nombre, email, legajo, siguiente);

    }

    @Override
    public boolean sosCEO(){
        return true;
    }

    @Override
    protected void ejecutarAccion(Excusa excusa) {
        //System.out.println("Excusa Recibida \n" + excusa);
        //System.out.println("Excusa gestionada por: " + this.getNombre());

        EmailSender emailSender = new EmailSender();
        emailSender.enviarEmail(excusa.obtenerEmailEmpleado(), this.getEmail(), asunto, cuerpo);

        Empleado empleado = new Empleado(excusa.obtenerNombreEmpleado(), excusa.obtenerEmailEmpleado(), excusa.obtenerLagajoEmpleado());

        Prontuario prontuario = new Prontuario(empleado, this.getLegajo(), excusa);
        notificar(prontuario);
    }

    @Override
    public void notificar(Prontuario prontuario) {
        AdministradorDeProntuarios administradorDeProntuarios = AdministradorDeProntuarios.getInstance();
        administradorDeProntuarios.guardarProntuario(prontuario);
    }
}
