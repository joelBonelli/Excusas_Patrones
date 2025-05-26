package ar.edu.davinci;

public class Recepcionista extends Encargado {

    private String asunto = "Motivo demora";
    private String cuerpo = "La licencia fue aceptada";

    public Recepcionista(String nombre, String email, int legajo, ModoDeResolver modoDeResolver) {
        super(nombre, email, legajo, modoDeResolver);
    }


    @Override
    protected boolean puedeManejar(Excusa excusa) {
        return excusa.getTipoDeExcusa() instanceof ExcusaTrivial;
    }


    @Override
    protected void ejecutarAccion(Excusa excusa) {
        System.out.println("Excusa Recibida: " + excusa.getDescripcion() +"\n" + excusa.toString());
        System.out.println("Excusa gestionada por: " + this.getNombre());
        EmailSender emailSender = new EmailSender();
        emailSender.enviarEmail(excusa.getEmpleado().getEmail(), this.getEmail(), asunto, cuerpo );
    }




}
