package ar.edu.davinci;

public class Productivo extends ModoDeResolver {
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
