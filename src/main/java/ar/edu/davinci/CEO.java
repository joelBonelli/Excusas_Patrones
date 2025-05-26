package ar.edu.davinci;

public class CEO extends Encargado implements Observador {
    private String asunto = "Aprobado por creatividad";
    private String cuerpo = "Buen descanzo";

    public CEO(String nombre, String email, int legajo, ModoDeResolver modoDeResolver) {
        super(nombre, email, legajo, modoDeResolver);
    }


    @Override
    protected boolean puedeManejar(Excusa excusa) {
        return excusa.getTipoDeExcusa() instanceof ExcusaInverosimil;
    }

    @Override
    protected void ejecutarAccion(Excusa excusa) {
        System.out.println("Excusa Recibida: " + excusa.getDescripcion() +"\n" + excusa.toString());
        System.out.println("Excusa gestionada por: " + this.getNombre());
        EmailSender emailSender = new EmailSender();
        emailSender.enviarEmail(excusa.getEmpleado().getEmail(), this.getEmail(), asunto, cuerpo);
        Prontuario prontuario = new Prontuario(excusa.getEmpleado(), this.getLegajo(), excusa);
        notificar(prontuario);
    }


    @Override
    public void notificar(Prontuario prontuario) {
        AdministradorDeProntuarios administradorDeProntuarios = new AdministradorDeProntuarios();
        administradorDeProntuarios.guardarProntuario(prontuario);
    }
}
