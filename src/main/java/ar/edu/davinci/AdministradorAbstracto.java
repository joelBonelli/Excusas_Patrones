package ar.edu.davinci;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

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
    public void notificarObservador() {
        EmailSender email = new EmailSender();

        for (CEO ceo : ceos) {
            String asunto = ceo.getNombre();
            String cuerpo = ceo.toString();
            email.enviarEmail(ceo.getEmail(), emailOrigen, asunto, cuerpo );
        }
        System.out.println("Email enviado a los CEOs");
    }


}
