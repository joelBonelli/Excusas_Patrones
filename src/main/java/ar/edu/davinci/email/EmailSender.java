package ar.edu.davinci.email;

public class EmailSender implements EnviarEmail {

    @Override
    public void enviarEmail(String emailDestino, String emailOrigen, String emailAsunto, String emailCuerpo) {
        System.out.println("--------------------------------"+
                "\nEmail enviado a: " + emailDestino +
                "\nEmail origen: " + emailOrigen +
                "\nAsunto: " + emailAsunto +
                " \nCuerpo: " + emailCuerpo +
                "\n--------------------------------");
    }
}
