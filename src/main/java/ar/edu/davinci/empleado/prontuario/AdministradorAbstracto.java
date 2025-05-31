package ar.edu.davinci.empleado.prontuario;

import ar.edu.davinci.email.EmailSender;
import ar.edu.davinci.empleado.encargado.tiposDeEncargado.CEO;
import ar.edu.davinci.empleado.prontuario.interfaces.AdministradorObservable;

import java.util.ArrayList;
import java.util.List;

public abstract class AdministradorAbstracto implements AdministradorObservable {

    protected List<CEO> ceos = new ArrayList<CEO>();
    protected String emailOrigen = "prontuarios@gmail.com";

    @Override
    public void agregarObservador(CEO ceo) {
        ceos.add(ceo);
    }

    @Override
    public void removerObservador(CEO ceo) {
        ceos.remove(ceo);
    }

    @Override
    public void notificarObservador(Prontuario prontuario) {
        EmailSender email = new EmailSender();

        for (CEO ceo : ceos) {
            String asunto = ceo.getNombre();
            String cuerpo = ceo.toString();
            email.enviarEmail(ceo.getEmail(), emailOrigen, asunto, cuerpo );
        }
        System.out.println("Email enviado a todos los CEOs"+
                "\nNuevo Prontuario Ingresado: "+
                "\nEmpleado: " + prontuario.getEmpleado() +
                "\nExcusa: " + prontuario.getExcusa() +
                "\n--------------------------");
    }


}
