package ar.edu.davinci;

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
        return excusa.getTipoDeExcusa() instanceof ExcusaModerada;
    }

    @Override
    protected void ejecutarAccion(Excusa excusa) {
        System.out.println("Excusa Recibida: " + excusa.getDescripcion() +"\n" + excusa.toString());
        String emailEmpleado = excusa.getEmpleado().getEmail();
        EmailSender emailSender = new EmailSender();

        if(excusa.getTipoDeExcusa() instanceof SeCortoLaLuz){
            System.out.println("Excusa gestionada por: " + this.getNombre());
            emailSender.enviarEmail(emailEdesur, emailEmpleado, asuntoEdesur, cuerpoEdesur);
        } else {
            System.out.println("Excusa gestionada por: " + this.getNombre());
            emailSender.enviarEmail(excusa.getEmpleado().getEmail(), this.getEmail(), asunto, cuerpo);
        }
    }


}
